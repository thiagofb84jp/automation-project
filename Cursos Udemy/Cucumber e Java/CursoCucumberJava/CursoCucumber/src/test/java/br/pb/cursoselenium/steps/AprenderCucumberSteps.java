package br.pb.cursoselenium.steps;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import br.pb.cursoselenium.converters.DateConverter;
import cucumber.api.Transform;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AprenderCucumberSteps {

	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {
		System.out.println("Imprima qualquer coisa por aqui!");
	}

	@Quando("^executá-lo$")
	public void executáLo() throws Throwable {
	}

	@Então("^a especificação deve finalizar com sucesso$")
	public void aEspecificaçãoDeveFinalizarComSucesso() throws Throwable {
	}

	private int contador = 0;

	@Dado("^que o valor do contador é (\\d+)$")
	public void queOValorDoContadorÉ(int arg1) throws Throwable {
		contador = arg1;
	}

	@Quando("^eu incrementar (\\d+)$")
	public void euIncrementar(int arg1) throws Throwable {
		contador = contador + arg1;
	}

	@Então("^o valor do contador será (\\d+)$")
	public void oValorDoContadorSerá(int arg1) throws Throwable {
		// System.out.println(arg1);
		// System.out.println(contador);
		// System.out.println(arg1 == contador);
		// Assert.assertTrue(arg1 == contador); // Verificação utilizando assertTrue
		Assert.assertEquals(arg1, contador);
	}

	/*
	 * Passo comentado, pois, logo abaixo, existe uma forma mais fácil de se
	 * declarar o 'Date'
	 * 
	 * Date entrega = new Date(); Calendar cal = Calendar.getInstance();
	 * 
	 * @Dado("^que a entrega é dia (\\d+)/(\\d+)/(\\d+)$") public void
	 * queAEntregaÉDia(int dia, int mes, int ano) throws Throwable {7 undefined
	 * cal.set(Calendar.DAY_OF_MONTH, dia); cal.set(Calendar.MONTH, mes - 1);
	 * cal.set(Calendar.YEAR, ano); entrega = cal.getTime(); }
	 * 
	 */

	Date entrega = new Date();

	@Dado("^que a entrega é dia (.*)$")
	public void queAEntregaÉDia(@Transform(DateConverter.class) Date data) throws Throwable {
		entrega = data;
		System.out.println(entrega);
	}

	@Quando("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrasarEmDias(int arg1, String tempo) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if (tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, arg1);
		}
		if (tempo.equals("meses")) {
			cal.add(Calendar.MONTH, arg1);
		}
		entrega = cal.getTime();
	}

	@Então("^a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeráEfetuadaEm(String data) throws Throwable {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		// DateFormat format = new SimpleDateFormat("dd/MMMM/yyyy");
		String dataFormatada = format.format(entrega);
		Assert.assertEquals(data, dataFormatada);
	}

	@Dado("^que o ticket( especial)? é (A.\\d{3})$")
	public void queOTicketÉAF(String tipo, String arg1) throws Throwable {
	}

	@Dado("^que o valor da passagem é R\\$ (.*)$")
	public void queOValorDaPassagemÉR$(Double numero) throws Throwable {
		System.out.println(numero);
	}

	@Dado("^que o nome do passageiro é \"(.5,20)\"$")
	public void queONomeDoPassageiroÉ(String arg1) throws Throwable {
	}

	@Dado("^que o telefone do passageiro é (9\\d{3}-\\d{4})$")
	public void queOTelefoneDoPassageiroÉ(String telefone) throws Throwable {
	}

	@Dado("^criar os steps$")
	public void criarOsSteps() throws Throwable {
	}

	@Dado("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() throws Throwable {
	}
}