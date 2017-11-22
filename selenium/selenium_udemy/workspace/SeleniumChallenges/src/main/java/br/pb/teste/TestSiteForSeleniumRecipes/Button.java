package br.pb.teste.TestSiteForSeleniumRecipes;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Button {
	
	private WebDriver driver;
	
	public String msgFirefox = "You choose a Firefox Browser! Congratulations!";
	public String msgChrome = "You choose a Chrome Browser! Congratulations!";
	public String msgIE = "You choose a IE Browser! Congratulations!";
	public String msgOpera = "You choose a Opera Browser! Congratulations!";
	public String msgSafari = "You choose a Safari Browser! Congratulations!";

	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///media/thiago/9414FF9714FF7B16/Automacao/selenium/site/index.html");
		driver.findElement(By.id("button")).click();
	}
	
	@After
	public void finaliza() {
		driver.quit();
	}
	
	@Test
	public void standartButton() {
		driver.findElement(By.id("choose_firefox_btn")).click();		
		driver.findElement(By.id("choose_chrome_btn")).click();
		driver.findElement(By.id("choose_ie_btn")).click();
		driver.findElement(By.id("choose_opera_btn")).click();
		driver.findElement(By.id("choose_safari_btn")).click();
		driver.findElement(By.id("choose_selenium_btn")).click();

		Assert.assertEquals(msgFirefox, driver.findElement(By.id("choose_firefox_msg")).getText());		
		Assert.assertEquals(msgChrome, driver.findElement(By.id("choose_chrome_msg")).getText());
		Assert.assertEquals(msgIE, driver.findElement(By.id("choose_ie_msg")).getText());
		Assert.assertEquals(msgOpera, driver.findElement(By.id("choose_opera_msg")).getText());
		Assert.assertEquals(msgSafari, driver.findElement(By.id("choose_safari_msg")).getText());
	}
	
	@Test
	public void invalidInput() {
		
	}
	
	@Test
	public void validInput() {
		
	}
}
