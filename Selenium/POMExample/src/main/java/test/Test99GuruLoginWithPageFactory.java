package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageFactory.Guru99HomePage;
import pageFactory.Guru99Login;

public class Test99GuruLoginWithPageFactory {

	private static final String URL_DEMO = "http://demo.guru99.com/V4/";
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
	 * This test go to 'http://demo.guru99.com/V4/'
	 * Verify login page title as guru99 bank
	 * Login to application
	 * Verify the home page using Dashboard message
	 */
	
	@Test
	public void testHomePageAppearCorrect() {
		objLogin = new Guru99Login(driver); //Create Login Page Object
		String loginPageTitle = objLogin.getLoginTitle(); //Verify login page title
		Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
		
		objLogin.loginToGuru99("mngr162598", "Enenequ"); //Login to application
		
		objHomePage = new Guru99HomePage(driver); //Go to next page
		Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mngr162598")); //Verify home page
	}
	
	@After
	public void killDriver() {
		driver.close();
	}
}