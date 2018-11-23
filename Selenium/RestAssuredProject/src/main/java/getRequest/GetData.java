package getRequest;

import static io.restassured.RestAssured.get;

import org.junit.Assert;
import org.junit.Test;


public class GetData {
	String api = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
	
	//Get the status code of the API and verify that the response is success (200) using assert
	@Test
	public void testResponseCode() {
		int code = get(api).getStatusCode();
		System.out.println("Code: " + code);
		Assert.assertEquals(code, 200);
	}
	
	//Get the response time of the API and print it
	@Test
	public void testBody() {
		Long time = get(api).getTime();
		System.out.println("Response Time: " + time);
	}
}