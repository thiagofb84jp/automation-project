package br.pb.signup;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SignUpFormTest extends FuncionalTest {

	private static final String URL_ACCESS = "https://www.kimschiller.com/page-object-pattern-tutorial/";

	@Test
	public void signUp() {
		driver.get(URL_ACCESS);

		SignUpPage signUpPage = new SignUpPage(driver);
		assertTrue(signUpPage.isInitialized());

		signUpPage.enterName("James", "Heatherland");
		signUpPage.enterAddress("123 Street", "12345");

		ReceiptPage receiptPage = signUpPage.submit();
		assertTrue(receiptPage.isInitialized());

		assertEquals("Thank you!", receiptPage.confirmationHeader());
		System.out.println("The first test has been executed by sucess.");
	}

	@Test
	public void clickButton() {
		driver.get(URL_ACCESS);

		SignUpPage signUpPage = new SignUpPage(driver);
		assertTrue(signUpPage.isInitialized());
		
		ReceiptPage receiptPage = signUpPage.submit();
		assertTrue(receiptPage.isInitialized());

		assertEquals("Thank you!", receiptPage.confirmationHeader());
		System.out.println("The second test has been executed by sucess.");
	}
}
