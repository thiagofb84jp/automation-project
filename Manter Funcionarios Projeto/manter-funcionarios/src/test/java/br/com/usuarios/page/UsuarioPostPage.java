package br.com.usuarios.page;

import org.json.simple.JSONObject;
import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class UsuarioPostPage {
	public static final String API_USUARIO = "api/usuario/";
	public static final String API_URL_INVALIDA = "api/url_invalida/";

	JSONObject requestParams = new JSONObject();
	RequestSpecification request = RestAssured.given();

	public void lerDadosHeaderAndBody() {
		request.header("Content-Type", "application/json");
		request.body(requestParams.toString());
	}

	public void informarValor(String vlrJSON, String descricao) {
		requestParams.put(vlrJSON, descricao);
	}

	public void validarStatus(int retornoValor) {
		lerDadosHeaderAndBody();
		Response response = request.post(API_USUARIO);
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, retornoValor);
	}

	public void validarStatusURL(int retornoValor) {
		lerDadosHeaderAndBody();
		Response response = request.post(API_URL_INVALIDA);
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, retornoValor);
	}

	public void validarStatusUsuario(String descricao, boolean verdadeiroOuFalso) {
		lerDadosHeaderAndBody();
		Response response = request.post(API_USUARIO);
		ResponseBody body = response.getBody();
		System.out.println("Response Body is: " + response.body().asString());
		Assert.assertEquals(body.asString().contains(descricao), verdadeiroOuFalso);
	}
}