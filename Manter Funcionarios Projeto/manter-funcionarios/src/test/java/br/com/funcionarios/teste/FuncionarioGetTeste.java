package br.com.funcionarios.teste;

import org.junit.Before;
import org.junit.Test;

import br.com.funcionarios.page.FuncionarioGetPage;
import io.restassured.RestAssured;

public class FuncionarioGetTeste {

	private static final String URL_TESTES = "http://localhost:8080/";

	FuncionarioGetPage funcGetPage = new FuncionarioGetPage();

	@Before
	public void iniciarURLTestes() {
		RestAssured.baseURI = URL_TESTES;
	}

	@Test
	public void verificarConsultaUsuario() {
		funcGetPage.validarStatusRetorno(14, "Melissa Aline Juliana Assunção", 200);
	}

	@Test
	public void verificarUsuarioDiferenteEsperado() {
		funcGetPage.validarStatusRetornoJson(1, "Oliver Lorenzo das Neves", false);
	}

	@Test
	public void verificarUsuarioComURLInvalida() {
		funcGetPage.validarStatusComURLInvalida(404);
	}
}