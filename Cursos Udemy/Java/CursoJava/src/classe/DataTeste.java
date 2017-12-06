package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data nascimento = new Data();

		nascimento.dia = 19;
		nascimento.mes = 10;
		nascimento.ano = 1984;
		
		Data casamento = new Data(8, 9, 2010);

		System.out.println("Data de Nascimento: " + nascimento.formatar());
		System.out.println("Data de Casamento: " + casamento.formatar());
	}
}