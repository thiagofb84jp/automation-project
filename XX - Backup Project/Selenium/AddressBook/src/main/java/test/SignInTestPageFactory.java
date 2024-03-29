package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageFactory.SignInPageFactory;

public class SignInTestPageFactory {

	private static final String URL_ADDRESS_BOOK = "http://a.testaddressbook.com/";

	public String strLogin = "kaueotaviobrito@rafaelsouza.com.br";
	public String strPassword = "XmlINHz30O";

	public String strInvLogin = "rrodrigoanthonyricardoaparicio@gmeil.com";
	public String strInvPasswrd = "Enenequ";

	public String strInvEmailFormat = "mngr162598@email";

	WebDriver driver;
	SignInPageFactory objSignInPage;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL_ADDRESS_BOOK);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		objSignInPage = new SignInPageFactory(driver);
		objSignInPage.clickLinkSignIn();
	}
	
	@Test
	public void clickAllTheFieldsEmpty() {
		objSignInPage.clickBtnSignIn();
		objSignInPage.validateBadMessage("Bad email or password.");
	}
	
	@Test
	public void signInWithEmailEmpty() {
		objSignInPage.setEmail("");
		objSignInPage.setPassword(strInvPasswrd);
		objSignInPage.clickBtnSignIn();
		objSignInPage.validateBadMessage("Bad email or password.");
	}
	
	@Test
	public void signInWithPasswordEmpty() {
		objSignInPage.setEmail(strInvLogin);
		objSignInPage.setPassword("");
		objSignInPage.clickBtnSignIn();
		objSignInPage.validateBadMessage("Bad email or password.");
	}
	
	@Test
	public void signInWithInvalidSession() {
		objSignInPage.setEmail(strInvLogin);
		objSignInPage.setPassword(strInvPasswrd);
		objSignInPage.clickBtnSignIn();
		objSignInPage.validateBadMessage("Bad email or password.");
	}
	
	@Test
	public void signInWithSucessful() {
		objSignInPage.setEmail(strLogin);
		objSignInPage.setPassword(strPassword);
		objSignInPage.clickBtnSignIn();
		objSignInPage.validateUserLoggedIn(strLogin, "A simple web app for showing off your testing");
		objSignInPage.clickLinkSignOut();
	}
	
	@Test
	public void signInWithInvalidEmailFormat() {
		objSignInPage.setEmail(strInvEmailFormat);
		objSignInPage.setPassword(strPassword);
		objSignInPage.clickBtnSignIn();
		objSignInPage.validateBadMessage("Bad email or password.");
	}
	
	@Test
	public void signInWithWrongPassword() {
		objSignInPage.setEmail(strLogin);
		objSignInPage.setPassword(strInvPasswrd);
		objSignInPage.clickBtnSignIn();
		objSignInPage.validateBadMessage("Bad email or password.");
	}
	
	@After
	public void killDriver() {
		driver.close();
	}
}