package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.SignUpPage;

public class SignUpTest {

	private static final String URL_ADDRESS_BOOK = "http://a.testaddressbook.com/";

	public String strLogin = "gaelcarlosleonardonogueira-81@infolink.com.br";
	public String strPassword = "jOhgSODByY";

	public String strInvLogin = "mngr162598@email.com";
	public String strInvPasswrd = "Enenequ";

	public String strInvEmailFormat = "mngr162598@email";

	WebDriver driver;
	SignUpPage objSignUpPage;

	@Before
	public void setUp() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL_ADDRESS_BOOK);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		objSignUpPage = new SignUpPage(driver);
		objSignUpPage.clickLinkSignIn();
		objSignUpPage.clickLinkSignUp();
	}
	
	@Test
	public void clickAllTheFieldsEmpty() {
		objSignUpPage.clickBtnSignIn();
	}
	
	@Test
	public void signInWithEmailEmpty() {
		objSignUpPage.setEmail("");
		objSignUpPage.setPassword(strInvPasswrd);
		objSignUpPage.clickBtnSignIn();
	}
	
	@Test
	public void signInWithPasswordEmpty() {
		objSignUpPage.setEmail(strInvLogin);
		objSignUpPage.setPassword("");
		objSignUpPage.clickBtnSignIn();
	}
	
	@Test
	public void signInWithInvalidSession() {
		objSignUpPage.setEmail(strInvLogin);
		objSignUpPage.setPassword(strInvPasswrd);
		objSignUpPage.clickBtnSignIn();
	}
	
	@Test
	public void signInWithSucessful() {
		objSignUpPage.setEmail(strLogin);
		objSignUpPage.setPassword(strPassword);
		objSignUpPage.clickBtnSignIn();
	}
	
	@Test
	public void signInWithInvalidEmailFormat() {
		objSignUpPage.setEmail(strInvEmailFormat);
		objSignUpPage.setPassword(strPassword);
		objSignUpPage.clickBtnSignIn();
	}
	
	@Test
	public void signInWithWrongPassword() {
		objSignUpPage.setEmail(strLogin);
		objSignUpPage.setPassword(strInvPasswrd);
		objSignUpPage.clickBtnSignIn();
	}
	
	@After
	public void killDriver() {
		driver.close();
	}
}