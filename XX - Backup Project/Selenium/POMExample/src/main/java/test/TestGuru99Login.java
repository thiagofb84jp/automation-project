package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.Guru99HomePage;
import pages.Guru99Login;

public class TestGuru99Login {

	private static final String URL_DEMO = "http://demo.guru99.com/V4/";
	public String strLogin = "mngr162598";
	public String strSenha = "Enenequ";
	
	WebDriver driver;
	Guru99Login objLogin;
	Guru99HomePage objHomePage;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL_DEMO);
	}
	
	/**
	 * This test case will login in 'http://demo.guru99.com/V4/'
	 * Verify login page title as guru99 bank
	 * Login to application
	 * Verify the home page using Dashboard message
	 */
	
	@Test
	public void testHomePageApppearCorrect() {
		objLogin = new Guru99Login(driver);
		String loginPageTitle = objLogin.getLoginTitle();
		Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
		objLogin.loginToGuru99(strLogin, strSenha);
		
		objHomePage = new Guru99HomePage(driver);
		Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : " + strLogin));
	}
	
	@After
	public void killDriver() {
		driver.close();
	}
}