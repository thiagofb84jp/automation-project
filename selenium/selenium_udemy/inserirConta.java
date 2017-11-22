package com.example.tests;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class inserirConta {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://srbarriga.herokuapp.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testInserirConta() throws Exception {
		selenium.open("/");
		selenium.click("link=Contas");
		selenium.click("link=Adicionar");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=nome", "Conta 8");
		selenium.click("css=button.btn.btn-primary");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Conta adicionada com sucesso!", selenium.getText("css=div.alert.alert-success"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
