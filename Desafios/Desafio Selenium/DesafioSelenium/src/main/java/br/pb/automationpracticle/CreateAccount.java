package br.pb.automationpracticle;

import static br.pb.core.DriverFactory.getDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.pb.core.DSL;
import br.pb.core.DriverFactory;

public class CreateAccount {
	

	private DSL dsl;

	@Before
	public void inicializa() {
		getDriver().get("http://www.automationpractice.com/");
		dsl = new DSL();

		dsl.clicarLink("Sign in");
		
		dsl.escrever("email_create", "joao@gmail.com");
		dsl.clicarBotao("SubmitCreate");

		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submitAccount")));
	}

	@After
	public void finaliza() {
		DriverFactory.killDriver();
	}
	
	@Test
	public void testCriarNovaContaComCamposVazios() {		
		dsl.clicarBotao("submitAccount");
		
		List<WebElement> erros = DriverFactory.getDriver().findElements(By.xpath("//div[@class='alert alert-danger']//ol//li"));
		
		List<String> msgs = new ArrayList<String>();
		
		for (WebElement el : erros) {
			msgs.add(el.getText()); 
		}
		
		Assert.assertEquals(8, erros.size());
		Assert.assertTrue(msgs.containsAll(Arrays.asList(
					"You must register at least one phone number.",
					"lastname is required.",
					"firstname is required.",
					"passwd is required.",
					"address1 is required.",
					"city is required.",
					"The Zip/Postal code you've entered is invalid. It must follow this format: 00000",
					"This country requires you to choose a State."
		 )));
	}
	
	@Test
	public void testCriarNovaContaApenasComTelefone() {
		dsl.escrever("phone_mobile", "+55 83 98827-1112");
		dsl.clicarBotao("submitAccount");

		List<WebElement> erros = DriverFactory.getDriver().findElements(By.xpath("//div[@class='alert alert-danger']//ol//li"));
		
		List<String> msgs = new ArrayList<String>();
		
		for (WebElement el : erros) {
			msgs.add(el.getText()); 
		}
		
		Assert.assertEquals(7, erros.size());
		Assert.assertTrue(msgs.containsAll(Arrays.asList(
					"lastname is required.",
					"firstname is required.",
					"passwd is required.",
					"address1 is required.",
					"city is required.",
					"The Zip/Postal code you've entered is invalid. It must follow this format: 00000",
					"This country requires you to choose a State."
		 )));
	}
}
