package br.com.usuarios.teste;

import org.junit.Before;
import org.junit.Test;

import br.com.usuarios.page.UsuarioGetPage;
import io.restassured.RestAssured;

public class UsuarioGetTeste {
	
	private static final String URL_TESTES = "http://localhost:8080/";
	
	UsuarioGetPage usrGetPage = new UsuarioGetPage();
	
	@Before
	public void iniciarURLTestes() {
		RestAssured.baseURI = URL_TESTES;
	}
	
	@Test
	public void verificarConsultaUsuario() {
		usrGetPage.validarStatusRetorno(4, "laura.alves", 200);
	}
	
	@Test
	public void verificarUsuarioDiferenteEsperado() {
		usrGetPage.validarStatusRetornoJson(4, "maria.lima", false);
	}
	
	@Test
	public void verificarUsuarioComURLInvalida() {
		usrGetPage.validarStatusRetJsonComURLInvalida(404);
	}
}