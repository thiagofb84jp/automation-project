package br.pb.devin.tests;

import static br.pb.core.DriverFactory.getDriver;
import static br.pb.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.pb.devin.pages.CalculadoraComplexaPage;

public class TesteCalculadoraComplexa {
	private CalculadoraComplexaPage page;

	@Before
	public void inicializa() {
		getDriver().get("http://www.devin.com.br/arquivos/calculadora-complexa.html");
		page = new CalculadoraComplexaPage();
	}

	@After
	public void finaliza() {
		killDriver();
	}

	@Test
	public void testSomar() {
		page.setValor("2");
		page.setOperacao("+");
		page.setValor("5");
		page.setCalcular();

		Assert.assertEquals("7", page.obterResultado());
	}

	@Test
	public void testSubtrair() {
		page.setValor("9");
		page.setOperacao("-");
		page.setValor("2");
		page.setCalcular();

		Assert.assertEquals("7", page.obterResultado());
	}

	@Test
	public void testMultiplicar() {
		page.setValor("8");
		page.setOperacao("*");
		page.setValor("5");
		page.setCalcular();

		Assert.assertEquals("40", page.obterResultado());
	}

	@Test
	public void testDividir() {
		page.setValor("1");
		page.setValor("0");
		page.setOperacao("/");
		page.setValor("5");
		page.setCalcular();

		Assert.assertEquals("2", page.obterResultado());
	}

	@Test
	public void testDivisaoPorZero() {
		page.setValor("5");
		page.setValor("0");
		page.setOperacao("/");
		page.setValor("0");
		page.setCalcular();

		Assert.assertEquals("Infinity", page.obterResultado());
	}
}