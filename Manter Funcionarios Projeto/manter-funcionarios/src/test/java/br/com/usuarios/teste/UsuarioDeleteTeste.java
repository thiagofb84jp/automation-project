package br.com.usuarios.teste;

import org.junit.Before;
import org.junit.Test;

import br.com.usuarios.page.UsuarioDeletePage;
import io.restassured.RestAssured;

public class UsuarioDeleteTeste extends UsuarioDeletePage {

	private static final String URL_TESTES = "http://localhost:8080/";

	UsuarioDeletePage usuarioPage = new UsuarioDeletePage();

	@Before
	public void iniciarURLTestes() {
		RestAssured.baseURI = URL_TESTES;
	}

	@Test
	public void excluirUsuarioValido() {
		usuarioPage.validarStatusRetExclusao(1, 200);
	}

	@Test
	public void excluirUsuarioInvalido() {
		usuarioPage.validarStatusRetExclusao(100, 500);
	}

	@Test
	public void excluirUsuarioComURLInvalida() {
		usuarioPage.validarStatusRetExclComURLInvalida(1, 404);
	}
}