package br.pb.devin;

import static br.pb.core.DriverFactory.getDriver;
import static br.pb.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.pb.core.DSL;

public class TesteCalculadoraSimples {
	private DSL dsl;

	@Before
	public void inicializa() {
		dsl = new DSL();
		getDriver().get("http://www.devin.com.br/arquivos/calculadora-simples.html");
	}

	@After
	public void finaliza() {
		killDriver();
	}

	@Test
	public void somar() {
		dsl.escrever("valor1", "10");
		dsl.escrever("valor2", "10");
		dsl.selecionarCombo("oper", "Somar");
		dsl.clicarBotao(By.className("botao"));

		Assert.assertEquals("20", dsl.obterValorCampo("res"));
	}

	@Test
	public void subtrair() {
		dsl.escrever("valor1", "20");
		dsl.escrever("valor2", "10");
		dsl.selecionarCombo("oper", "Subtrair");
		dsl.clicarBotao(By.className("botao"));

		Assert.assertEquals("10", dsl.obterValorCampo("res"));
	}

	@Test
	public void multiplicar() {
		dsl.escrever("valor1", "20");
		dsl.escrever("valor2", "10");
		dsl.selecionarCombo("oper", "Multiplicar");
		dsl.clicarBotao(By.className("botao"));

		Assert.assertEquals("200", dsl.obterValorCampo("res"));
	}

	@Test
	public void dividir() {
		dsl.escrever("valor1", "20");
		dsl.escrever("valor2", "10");
		dsl.selecionarCombo("oper", "Dividir");
		dsl.clicarBotao(By.className("botao"));

		Assert.assertEquals("2", dsl.obterValorCampo("res"));
	}

	@Test
	public void divisaoPorZero() {
		dsl.escrever("valor1", "10");
		dsl.escrever("valor2", "0");
		dsl.selecionarCombo("oper", "Dividir");
		dsl.clicarBotao(By.className("botao"));

		Assert.assertEquals("Infinity", dsl.obterValorCampo("res"));
	}

	@Test
	public void calculadoraComValoresVazios() {
		dsl.clicarBotao(By.className("botao"));
		Assert.assertEquals("NaN", dsl.obterValorCampo("res"));

		dsl.selecionarCombo("oper", "Subtrair");
		dsl.clicarBotao(By.className("botao"));
		Assert.assertEquals("0", dsl.obterValorCampo("res"));

		dsl.selecionarCombo("oper", "Multiplicar");
		dsl.clicarBotao(By.className("botao"));
		Assert.assertEquals("0", dsl.obterValorCampo("res"));

		dsl.selecionarCombo("oper", "Dividir");
		dsl.clicarBotao(By.className("botao"));
		Assert.assertEquals("NaN", dsl.obterValorCampo("res"));
	}

}
