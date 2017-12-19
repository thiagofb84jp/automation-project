package br.pb.cursoselenium.test;
import static br.pb.cursoselenium.core.DriverFactory.getDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.pb.cursoselenium.core.DSL;
import br.pb.cursoselenium.core.DriverFactory;

public class TesteAjax {
	private DSL dsl;

	@Before
	public void inicializa() {
		getDriver().get("https://www.primefaces.org/showcase/ui/ajax/basic.xhtml");
		dsl = new DSL();
	}

	@After
	public void finaliza() {
		DriverFactory.killDriver();
	}

	@Test
	public void ajax() {
		dsl.escrever("j_idt112:name", "Mary");
		dsl.clicarBotao("j_idt112:j_idt115");
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.textToBe(By.id("j_idt112:display"), "Mary"));
		Assert.assertEquals("Mary", dsl.obterTexto("j_idt112:display"));
	}

	@Test
	public void ajaxComElementoEspera() {
		dsl.escrever("j_idt112:name", "Mary");
		dsl.clicarBotao("j_idt112:j_idt115");
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("j_idt125")));
		Assert.assertEquals("Mary", dsl.obterTexto("j_idt112:display"));
	}

}
