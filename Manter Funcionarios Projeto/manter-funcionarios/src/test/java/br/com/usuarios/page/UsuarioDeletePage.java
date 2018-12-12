package br.com.usuarios.page;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class UsuarioDeletePage {

	public static final String API_USUARIO = "api/usuario/";
	public static final String API_URL_INVALIDA = "api/url_invalida/";

	RequestSpecification httpRequest = RestAssured.given();

	public void validarStatusRetExclusao(int id, int retornoStatus) {
		Response response = httpRequest.delete(API_USUARIO + id);
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, retornoStatus);
	}

	public void validarStatusRetExclComURLInvalida(int id, int retornoStatus) {
		Response response = httpRequest.delete(API_URL_INVALIDA + id);
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, retornoStatus);
	}
}