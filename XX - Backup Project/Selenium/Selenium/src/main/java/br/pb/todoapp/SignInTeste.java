package br.pb.todoapp;

import org.junit.Test;

import br.pb.core.FuncionalTest;

public class SignInTeste extends FuncionalTest {

	private static final String URL_TODO_APP = "https://qa-test.avenuecode.com/";

	SignInPage signInPage = new SignInPage(driver);

	public SignInTeste() {
		driver.get(URL_TODO_APP);
		signInPage.obterLink("Sign In");
	}

	@Test
	public void logarSemPreencherCamposObrigatorios() {
		signInPage.logar();
		signInPage.validarMsgFalha("Invalid email or password.");
	}

	@Test
	public void logarComEmailInvalido() {
		signInPage.obterEmail("email@email");
		signInPage.logar();
		signInPage.validarMsgFalha("Invalid email or password.");
	}
	
	@Test
	public void logarComSenhaInvalida() {
		signInPage.obterEmail("hhenriquejorgetomasdamata@netpont.com.br");
		signInPage.obterSenha("abcd_111");
		signInPage.logar();
		signInPage.validarMsgFalha("Invalid email or password.");
	}
	
	@Test
	public void logarComUsuarioInvalido() {
		signInPage.obterEmail("marinasilva@netpoint.com");
		signInPage.obterSenha("abcd_123");
		signInPage.logar();
		signInPage.validarMsgFalha("Invalid email or password.");
	}
	
	@Test
	public void logarComUsuarioValido() {
		signInPage.obterEmail("hhenriquejorgetomasdamata@netpont.com.br");
		signInPage.obterSenha("abcd_123");
		signInPage.logar();
		signInPage.validarMsgSucesso("Signed in successfully.");
	}
}