package br.com.funcionarios.teste;

import org.junit.Before;
import org.junit.Test;

import br.com.funcionarios.page.FuncionarioDeletePage;
import br.com.usuarios.page.UsuarioDeletePage;
import io.restassured.RestAssured;

public class FuncionarioDeleteTeste extends UsuarioDeletePage {

	private static final String URL_TESTES = "http://localhost:8080/";

	FuncionarioDeletePage funcDelPage = new FuncionarioDeletePage();

	@Before
	public void iniciarURLTestes() {
		RestAssured.baseURI = URL_TESTES;
	}

	@Test
	public void excluirFuncionarioValido() {
		funcDelPage.validarStatusRetExclusao(9, 200);
	}

	@Test
	public void excluirFuncionarioInvalido() {
		funcDelPage.validarStatusRetExclusao(100, 500);
	}

	@Test
	public void excluirUsuarioComURLInvalida() {
		funcDelPage.validarStatusRetExclComURLInvalida(30, 404);
	}
}