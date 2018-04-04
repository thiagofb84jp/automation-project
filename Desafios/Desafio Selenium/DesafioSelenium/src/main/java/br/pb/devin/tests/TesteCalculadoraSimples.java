package br.pb.devin.tests;

import static br.pb.core.DriverFactory.getDriver;
import static br.pb.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.pb.devin.pages.CalculadoraSimplesPage;

public class TesteCalculadoraSimples {
	private CalculadoraSimplesPage page;

	@Before
	public void inicializa() {
		getDriver().get("http://www.devin.com.br/arquivos/calculadora-simples.html");
		page = new CalculadoraSimplesPage();
	}

	@After
	public void finaliza() {
		killDriver();
	}

	@Test
	public void somar() {
		page.setValor1("10");
		page.setValor2("10");
		page.setOperacao("Somar");
		page.setCalcular();

		Assert.assertEquals("20", page.obterResultado());
	}

	@Test
	public void subtrair() {
		page.setValor1("20");
		page.setValor2("10");
		page.setOperacao("Subtrair");
		page.setCalcular();

		Assert.assertEquals("10", page.obterResultado());
	}

	@Test
	public void multiplicar() {
		page.setValor1("20");
		page.setValor2("10");
		page.setOperacao("Multiplicar");
		page.setCalcular();

		Assert.assertEquals("200", page.obterResultado());
	}

	@Test
	public void dividir() {
		page.setValor1("20");
		page.setValor2("10");
		page.setOperacao("Dividir");
		page.setCalcular();

		Assert.assertEquals("2", page.obterResultado());
	}

	@Test
	public void divisaoPorZero() {
		page.setValor1("10");
		page.setValor2("0");
		page.setOperacao("Dividir");
		page.setCalcular();

		Assert.assertEquals("Infinity", page.obterResultado());
	}

	@Test
	public void calculadoraComValoresVazios() {
		page.setCalcular();
		Assert.assertEquals("NaN", page.obterResultado());

		page.setOperacao("Subtrair");
		page.setCalcular();
		Assert.assertEquals("0", page.obterResultado());

		page.setOperacao("Multiplicar");
		page.setCalcular();
		Assert.assertEquals("0", page.obterResultado());

		page.setOperacao("Dividir");
		page.setCalcular();
		Assert.assertEquals("NaN", page.obterResultado());
	}

}
