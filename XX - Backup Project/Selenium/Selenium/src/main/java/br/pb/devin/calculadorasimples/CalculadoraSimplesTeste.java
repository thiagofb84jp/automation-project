package br.pb.devin.calculadorasimples;

import org.junit.Test;

import br.pb.core.FuncionalTest;

public class CalculadoraSimplesTeste extends FuncionalTest{

	private static final String URL_CALC_SIMPLES = "http://www.devin.com.br/wp-content/uploads/2008/10/calculadora-simples.html";
	
	CalculadoraSimplesPage calcPage = new CalculadoraSimplesPage(driver);
	
	public CalculadoraSimplesTeste() {
		driver.get(URL_CALC_SIMPLES);
	}
	
	@Test
	public void somar() {
		calcPage.obterValor1("99");
		calcPage.obterValor2("55");
		calcPage.somar();
		calcPage.validarResultado("154");
	}
	
	@Test
	public void subtrair() {
		calcPage.obterValor1("10");
		calcPage.obterValor2("2");
		calcPage.subtrair();
		calcPage.validarResultado("8");
	}
	
	@Test
	public void multiplicar() {
		calcPage.obterValor1("100");
		calcPage.obterValor2("2");
		calcPage.multiplicar();
		calcPage.validarResultado("200");
	}
	
	@Test
	public void dividir() {
		calcPage.obterValor1("50");
		calcPage.obterValor2("2");
		calcPage.dividir();
		calcPage.validarResultado("25");
	}
	
	@Test
	public void calcularSemInfomarValores() {
		calcPage.somar();
		calcPage.validarResultado("NaN");
	}
	
	@Test
	public void calcularDivisaoPorZero() {
		calcPage.obterValor1("2");
		calcPage.obterValor2("0");
		calcPage.dividir();
		calcPage.validarResultado("Infinity");
	}
}