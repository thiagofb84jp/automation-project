package br.pb.demoqa;

import static br.pb.core.DriverFactory.getDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;

import br.pb.core.DSL;
import br.pb.core.DriverFactory;

public class TesteRegistration {

	private DSL dsl;

	String getNome = "Marcos Lima";
	String getSobrenome = "dos Santos Silva Júnior";
	String getTelefone = "5583982211";
	String getUsername = "marcos_junior";
	String getEmail = "marcos_junior@gmail.com";
	String getSenha = "abcd_655_#";
	String textoQualquer = "Caros amigos, a competitividade nas transações comerciais prepara-nos para enfrentar situações atípicas decorrentes das condições inegavelmente apropriadas. \nPor outro lado, o fenômeno da Internet afeta positivamente a correta previsão dos métodos utilizados na avaliação de resultados.";
	String solteiro = ".//*[@id='pie_register']/li[2]/div/div/input[1]";
	String dance = ".//*[@id='pie_register']/li[3]/div/div/input[1]";
	String reading = ".//*[@id='pie_register']/li[3]/div/div/input[2]";
	String country = "Brazil";
	String month = "10";
	String day = "30";
	String year = "1978";
	String msgConfirmacao = "Thank you for your registration";
	String msgErro = "Error: Username already exists";

	@Before
	public void inicializa() {
		getDriver().get("http://demoqa.com/");
		dsl = new DSL();
		dsl.clicarLink("Registration");
	}

	@After
	public void finaliza() {
		DriverFactory.killDriver();
	}

	@Test
	public void testeTextField() {
		dsl.escrever("name_3_firstname", getNome);
		dsl.escrever("name_3_lastname", getSobrenome);
		dsl.escrever("phone_9", getTelefone);
		dsl.escrever("username", getUsername);
		dsl.escrever("email_1", getEmail);
		dsl.escrever("password_2", getSenha);
		dsl.escrever("confirm_password_password_2", getSenha);

		Assert.assertEquals(getNome, dsl.obterValorCampo("name_3_firstname"));
		Assert.assertEquals(getSobrenome, dsl.obterValorCampo("name_3_lastname"));
		Assert.assertEquals(getTelefone, dsl.obterValorCampo("phone_9"));
		Assert.assertEquals(getUsername, dsl.obterValorCampo("username"));
		Assert.assertEquals(getEmail, dsl.obterValorCampo("email_1"));
		Assert.assertEquals(getSenha, dsl.obterValorCampo("password_2"));
		Assert.assertEquals(getSenha, dsl.obterValorCampo("confirm_password_password_2"));
	}

	@Test
	public void testeTextArea() {
		dsl.escrever("description", textoQualquer);
		Assert.assertEquals(textoQualquer, dsl.obterValorCampo("description"));
	}

	@Test
	public void testeRadioButton() {
		dsl.clicarRadio(solteiro);
		Assert.assertTrue(dsl.isRadioMarcado(solteiro));
	}

	@Test
	public void testeCheckBox() {
		dsl.clicarCheck(dance);
		dsl.clicarCheck(reading);

		Assert.assertTrue(dsl.isCheckMarcado(dance));
		Assert.assertTrue(dsl.isCheckMarcado(reading));
	}

	@Test
	public void deveInteragirComCombobox() {
		// Combo Cidade
		dsl.selecionarCombo("dropdown_7", country);
		Assert.assertEquals(country, dsl.obterValorCombo("dropdown_7"));

		// Combo Mês
		dsl.selecionarCombo("mm_date_8", month);
		Assert.assertEquals(month, dsl.obterValorCombo("mm_date_8"));

		// Combo Dia
		dsl.selecionarCombo("dd_date_8", day);
		Assert.assertEquals(day, dsl.obterValorCombo("dd_date_8"));

		// Combo Ano
		dsl.selecionarCombo("yy_date_8", year);
		Assert.assertEquals(year, dsl.obterValorCombo("yy_date_8"));
	}

	@Test
	public void deveValidarCadastroComSucesso() {
		dsl.escrever("name_3_firstname", getNome);
		dsl.escrever("name_3_lastname", getSobrenome);

		dsl.clicarCheck(dance);
		dsl.clicarCheck(reading);

		dsl.escrever("phone_9", getTelefone);
		dsl.escrever("username", getUsername);
		dsl.escrever("email_1", getEmail);
		dsl.escrever("password_2", getSenha);
		dsl.escrever("confirm_password_password_2", getSenha);

		dsl.clicarBotao(By.xpath(".//*[@id='pie_register']/li[14]/div/input"));

		Assert.assertEquals(msgConfirmacao, dsl.obterTexto(By.className("piereg_message")));
	}

	@Test
	@Ignore
	public void deveValidarCadastroUsuarioExistente() {
		dsl.escrever("name_3_firstname", getNome);
		dsl.escrever("name_3_lastname", getSobrenome);

		dsl.clicarCheck(dance);
		dsl.clicarCheck(reading);

		dsl.escrever("phone_9", getTelefone);
		dsl.escrever("username", getUsername);
		dsl.escrever("email_1", getEmail);
		dsl.escrever("password_2", getSenha);
		dsl.escrever("confirm_password_password_2", getSenha);

		dsl.clicarBotao(By.xpath(".//*[@id='pie_register']/li[14]/div/input"));

		Assert.assertEquals(msgErro, dsl.obterTexto(By.className("piereg_login_error")));
	}

}