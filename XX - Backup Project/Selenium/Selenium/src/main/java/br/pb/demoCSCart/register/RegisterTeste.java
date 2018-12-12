package br.pb.demoCSCart.register;

import org.junit.Test;

import br.pb.core.FuncionalTest;

public class RegisterTeste extends FuncionalTest {
	
	private static final String URL_DEMO_STORE = "http://demo.cs-cart.com/";

	protected String email = "benjaminosvaldoluccadasneves_@tursi.com.br";
	protected String senha = "abcd_123";
	protected String senhaDiferente = "abcd_123";

	RegisterPage registerPage = new RegisterPage(driver);
	
	public RegisterTeste() {
		driver.get(URL_DEMO_STORE);
		registerPage.clicarMinhaConta();
		registerPage.realizarNovoRegistro();
	}
	
	@Test
	public void registrarUsuarioComCamposVazios() {
		registerPage.registrar();
		
		registerPage.validarMsgFalhaEmail("The email address in the E-mail field is invalid.");
		registerPage.validarMsgFalhaSenha("The Password field is mandatory.");
		registerPage.validarMsgFalhaConfirmSenha("The Confirm password field is mandatory.");
	}
	
	@Test
	public void registrarUsuarioSemInformarEmail() {
		registerPage.informarSenha(senha);
		registerPage.confirmarSenha(senha);
		registerPage.registrar();
		
		registerPage.validarMsgFalhaEmail("The email address in the E-mail field is invalid.");
	}
	
	@Test
	public void registrarUsuarioSemInformarSenha() {
		registerPage.informarEmail(email);
		registerPage.registrar();
		
		registerPage.validarMsgFalhaSenha("The Password field is mandatory.");
		registerPage.validarMsgFalhaConfirmSenha("The passwords in the Password and Confirm password fields do not match.");
	}
	
	@Test
	public void registrarUsuarioApenasComEmailEConfirmarSenha() {
		registerPage.informarEmail(email);
		registerPage.confirmarSenha(senha);
		registerPage.registrar();
		
		registerPage.validarMsgFalhaSenha("The Password field is mandatory.");
		registerPage.validarMsgFalhaConfirmSenha("The passwords in the Password and Confirm password fields do not match.");
	}
	
	@Test
	public void registrarUsuarioComSenhasDiferentes() {
		registerPage.informarEmail(email);
		registerPage.informarSenha(senha);
		registerPage.confirmarSenha(senhaDiferente);
		registerPage.registrar();
		
		registerPage.validarMsgFalhaSenha("The passwords in the Password and Confirm password fields do not match.");
		registerPage.validarMsgFalhaConfirmSenha("The passwords in the Password and Confirm password fields do not match.");
	}
	
	@Test
	public void registrarUsuario() {
		registerPage.informarEmail(email);
		registerPage.informarSenha(senha);
		registerPage.confirmarSenha(senha);
		registerPage.registrar();
		
		registerPage.validarMsgRegistroSucesso("Sua conta foi registrada com sucesso");
	}
}