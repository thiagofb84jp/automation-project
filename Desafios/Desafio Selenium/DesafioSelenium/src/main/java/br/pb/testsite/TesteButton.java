package br.pb.testsite;

import static br.pb.core.DriverFactory.getDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.pb.core.DSL;
import br.pb.core.DriverFactory;

public class TesteButton {
	private DSL dsl;

	String msgFirefox = "You choose Firefox! Congratulations!";
	String msgChrome = "You choose Google Chrome! Congratulations!";
	String msgIE = "You choose Internet Explorer! Congratulations!";
	String msgOpera = "You choose Opera! Congratulations!";
	String msgSafari = "You choose Safari! Congratulations!";

	String msgInputNotValid = "Input is not valid";
	String msgInputValid = "Input OK";

	@Before
	public void inicializa() {
		dsl = new DSL();

		getDriver().get("file:///media/thiago/9414FF9714FF7B16/Automacao/Desafios/Desafio%20Selenium/site/index.html");
		dsl.clicarLink("Button");
	}

	@After
	public void finaliza() {
		DriverFactory.killDriver();
	}

	@Test
	public void chooseButton() {
		dsl.clicarBotao("firefox-button");
		dsl.clicarBotao("chrome-button");
		dsl.clicarBotao("ie-button");
		dsl.clicarBotao("opera-button");
		dsl.clicarBotao("safari-button");

		Assert.assertEquals(msgFirefox, dsl.obterTexto(By.id("firefox")));
		Assert.assertEquals(msgChrome, dsl.obterTexto(By.id("chrome")));
		Assert.assertEquals(msgIE, dsl.obterTexto(By.id("ie")));
		Assert.assertEquals(msgOpera, dsl.obterTexto(By.id("opera")));
		Assert.assertEquals(msgSafari, dsl.obterTexto(By.id("safari")));

		dsl.clicarLink("Voltar");
	}

	@Test
	public void validateInputWithoutValue() {
		dsl.clicarBotao("value-input");
		Assert.assertEquals(msgInputNotValid, dsl.obterTexto(By.id("value")));
	}

	@Test
	public void validateInputWithInvalidValue() {
		dsl.escrever("number", "0");
		dsl.clicarBotao("value-input");
		Assert.assertEquals(msgInputNotValid, dsl.obterTexto(By.id("value")));

		dsl.escrever("number", "11");
		dsl.clicarBotao("value-input");
		Assert.assertEquals(msgInputNotValid, dsl.obterTexto(By.id("value")));
	}

	@Test
	public void validateInputWithValidValue() {
		dsl.escrever("number", "1");
		dsl.clicarBotao("value-input");
		Assert.assertEquals(msgInputValid, dsl.obterTexto(By.id("value")));

		dsl.escrever("number", "10");
		dsl.clicarBotao("value-input");
		Assert.assertEquals(msgInputValid, dsl.obterTexto(By.id("value")));
	}

}
