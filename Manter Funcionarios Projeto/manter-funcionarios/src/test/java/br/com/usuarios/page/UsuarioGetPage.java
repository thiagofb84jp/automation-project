package br.com.usuarios.page;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class UsuarioGetPage {

	public static final String API_USUARIO = "api/usuario/";
	public static final String API_URL_INVALIDA = "api/url_invalida/";

	RequestSpecification httpRequest = RestAssured.given();
	
	public void validarStatusRetorno(int id, String retornoValor, int retornoStatus) {
		Response response = httpRequest.get(API_USUARIO + id);
		ResponseBody body = response.getBody();
		Assert.assertEquals(body.asString().contains(retornoValor), true);
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, retornoStatus);
	}

	public void validarStatusRetornoJson(int id, String retornoValor, boolean verdadeiroOuFalso) {
		Response response = httpRequest.get(API_USUARIO + id);
		ResponseBody body = response.getBody();
		Assert.assertEquals(body.asString().contains(retornoValor), verdadeiroOuFalso);
	}

	public void validarStatusRetJsonComURLInvalida(int retornoValor) {
		Response response = httpRequest.get(API_URL_INVALIDA);
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, retornoValor);
	}
}