package br.pb.core;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FuncionalTest {
	
	protected static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void cleanUp() {
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}