package br.pb.arquivei;

import org.junit.Test;

import br.pb.core.FuncionalTest;

public class LoginTeste extends FuncionalTest {

	private static final String URL_ARQUIVEI = "https://psel-app.arquivei.com.br/index/login";

	LoginPage loginPage = new LoginPage(driver);
	String email = "thiagofb84jp@gmail.com";
	String senha = "abcd_123";

	public LoginTeste() {
		driver.get(URL_ARQUIVEI);
	}

	@Test
	public void acessarSemPreencherCamposObrigatorios() {
		loginPage.btnEntrar();
		loginPage.validarMsgFalha();
	}
	
	@Test
	public void acessarPreenchendoApenasCampoEmail() {
		loginPage.campoEmail(email);
		loginPage.btnEntrar();
		loginPage.validarMsgFalha();
	}
	
	@Test
	public void acessarPreenchendoApenasCampoSenha() {
		loginPage.campoSenha(senha);
		loginPage.btnEntrar();
		loginPage.validarMsgFalha();
	}
	
	@Test
	public void acessarComUsuarioInvalido() {
		loginPage.campoEmail("jose_guedes_silva@outlook.com");
		loginPage.campoSenha("abcd_123");
		loginPage.btnEntrar();
		loginPage.validarMsgFalha();
	}
	
	@Test
	public void acessarComEmailInvalido() {
		loginPage.campoEmail("thiagofb84jp@gmail");
		loginPage.campoSenha("abcd_123");
		loginPage.btnEntrar();
		loginPage.validarMsgFalha();
	}
	
	@Test
	public void acessarComSenhaInvalida() {
		loginPage.campoEmail(email);
		loginPage.campoSenha("xxx_abcs99");
		loginPage.btnEntrar();
		loginPage.validarMsgFalha();
	}
	
	@Test
	public void acessarSistemaComSucesso() {
		loginPage.campoEmail(email);
		loginPage.campoSenha("abcd_123");
		loginPage.btnEntrar();
		loginPage.validarAcessoSistema(email);
	}
}