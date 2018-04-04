package br.pb.devin;

import static br.pb.core.DriverFactory.getDriver;
import static br.pb.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.pb.core.DSL;

public class TesteCalculadoraComplexa {
	private DSL dsl;

	@Before
	public void inicializa() {
		dsl = new DSL();
		getDriver().get("http://www.devin.com.br/arquivos/calculadora-complexa.html");
	}

	@After
	public void finaliza() {
		killDriver();
	}

	@Test
	public void testSomar() {
		dsl.clicarBotao(By.xpath("//input[@value='2']"));
		dsl.clicarBotao(By.xpath("//input[@value='+']"));
		dsl.clicarBotao(By.xpath("//input[@value='5']"));
		dsl.clicarBotao(By.xpath("//input[@value='=']"));

		Assert.assertEquals("7", dsl.obterValorCampo("visor"));
	}

	@Test
	public void testSubtrair() {
		dsl.clicarBotao(By.xpath("//input[@value='9']"));
		dsl.clicarBotao(By.xpath("//input[@value='-']"));
		dsl.clicarBotao(By.xpath("//input[@value='2']"));
		dsl.clicarBotao(By.xpath("//input[@value='=']"));

		Assert.assertEquals("7", dsl.obterValorCampo("visor"));
	}

	@Test
	public void testMultiplicar() {
		dsl.clicarBotao(By.xpath("//input[@value='8']"));
		dsl.clicarBotao(By.xpath("//input[@value='*']"));
		dsl.clicarBotao(By.xpath("//input[@value='5']"));
		dsl.clicarBotao(By.xpath("//input[@value='=']"));

		Assert.assertEquals("40", dsl.obterValorCampo("visor"));
	}

	@Test
	public void testDividir() {
		dsl.clicarBotao(By.xpath("//input[@value='1']"));
		dsl.clicarBotao(By.xpath("//input[@value='0']"));
		dsl.clicarBotao(By.xpath("//input[@value='/']"));
		dsl.clicarBotao(By.xpath("//input[@value='5']"));
		dsl.clicarBotao(By.xpath("//input[@value='=']"));

		Assert.assertEquals("2", dsl.obterValorCampo("visor"));
	}

	@Test
	public void testDivisaoPorZero() {
		dsl.clicarBotao(By.xpath("//input[@value='5']"));
		dsl.clicarBotao(By.xpath("//input[@value='0']"));
		dsl.clicarBotao(By.xpath("//input[@value='/']"));
		dsl.clicarBotao(By.xpath("//input[@value='0']"));
		dsl.clicarBotao(By.xpath("//input[@value='=']"));

		Assert.assertEquals("Infinity", dsl.obterValorCampo("visor"));
	}
}