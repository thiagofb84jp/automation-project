package br.com.funcionarios.page;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class FuncionarioGetPage {

	public static final String API_FUNCIONARIO = "api/funcionario/";
	public static final String API_URL_INVALIDA = "api/url_invalida/";

	RequestSpecification httpRequest = RestAssured.given();
	
	public void validarStatusRetorno(int id, String retornoValor, int retornoStatus) {
		Response response = httpRequest.get(API_FUNCIONARIO + id);
		ResponseBody body = response.getBody();
		Assert.assertEquals(body.asString().contains(retornoValor), true);
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, retornoStatus);
	}

	public void validarStatusRetornoJson(int id, String retornoValor, boolean verdadeiroOuFalso) {
		Response response = httpRequest.get(API_FUNCIONARIO + id);
		ResponseBody body = response.getBody();
		Assert.assertEquals(body.asString().contains(retornoValor), verdadeiroOuFalso);
	}

	public void validarStatusComURLInvalida(int retornoValor) {
		Response response = httpRequest.get(API_URL_INVALIDA);
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, retornoValor);
	}
}