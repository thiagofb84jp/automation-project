package getRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class SimpleGetTest {
	
	@Test
	public void getWeatherDetails() {
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/";

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "/Hyderabad");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is => " + responseBody);
	}
	
	@Test
	public void getResponse() {
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/";

		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/78789798798");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	public void weatherMessageBody() {
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/Hyderabad");
		
		ResponseBody body = response.getBody();
		System.out.println("Response Body is: " + body.asString());
		Assert.assertEquals(body.asString().contains("Hyderabad"), true);
	}
	
	@Test
	public void verifyCityInJsonResponse() {
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/Hyderabad");
		
		JsonPath jsonPathEvaluator = response.jsonPath();
		
		String city = jsonPathEvaluator.get("City");
		System.out.println("City received from Response: " + city);
		assertEquals(city, "Hyderabad");
	}
	
	@Test
	public void verifySquadName() {
		RestAssured.baseURI = "https://mdn.github.io/learning-area/javascript/oojs/json/superheroes.json";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get();
		
		//Obtendo o nome do 'SquadName'
		JsonPath jsonPathEvaluator = response.jsonPath();
		String squadName = jsonPathEvaluator.get("squadName");
		System.out.println("The Squad Name is: " + squadName);
		
		//Lendo o corpo do Json
		ResponseBody body = response.getBody();
		System.out.println("Response Body is: " + body.asString());
		Assert.assertEquals(body.asString().contains("Super hero squad"), true);
	}
	
	@Test
	public void displayAllNodes() {
		RestAssured.baseURI = "https://mdn.github.io/learning-area/javascript/oojs/json/superheroes.json";
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.get();
		JsonPath jsonPathEvaluator = response.jsonPath();
		
		System.out.println("Squad Name: " + jsonPathEvaluator.get("squadName"));
		System.out.println("Secret Base is: " + jsonPathEvaluator.get("secretBase"));
		System.out.println("Members: " + jsonPathEvaluator.get("members"));
	}
	
	@Test
	public void registrationSuccessful() {
		RestAssured.baseURI = "http://restapi.demoqa.com/customer/";
		RequestSpecification request = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Martin Giovanni");
		requestParams.put("LastName", "Santos Lima");
		requestParams.put("UserName", "martin_giovanni");
		requestParams.put("Password", "abcd_123");
		requestParams.put("Email", "martin_gio@azulcargo.com.br");
		
		request.body(requestParams.toJSONString());
		
		Response response = request.post("/register");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 201);
		
		System.out.println("Response body: " + response.body().asString());
		
		String successCode = response.jsonPath().get("SuccessCode");
		System.out.println(successCode);
		Assert.assertEquals(successCode, "OPERATION_SUCCESS");	
	}
}