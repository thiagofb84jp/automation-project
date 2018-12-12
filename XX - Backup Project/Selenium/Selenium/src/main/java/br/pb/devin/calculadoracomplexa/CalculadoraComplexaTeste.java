package br.pb.devin.calculadoracomplexa;

import org.junit.Test;

import br.pb.core.FuncionalTest;


public class CalculadoraComplexaTeste extends FuncionalTest{

	private static final String URL_CALC_COMPLEXA = "http://www.devin.com.br/wp-content/uploads/2008/10/calculadora-complexa.html";

	CalculadoraComplexaPage calcPage = new CalculadoraComplexaPage(driver);
	
	public CalculadoraComplexaTeste() {
		driver.get(URL_CALC_COMPLEXA);
	}
	
	@Test
	public void somar(){
		calcPage.obterValor("1");
		calcPage.obterValor("0");		
		calcPage.operador("+");		
		calcPage.obterValor("5");
		calcPage.obterValor("0");
		calcPage.obterResultado();	
		calcPage.validarResultado("60");
	}
	
	@Test
	public void subtrair(){
		calcPage.obterValor("5");
		calcPage.obterValor("0");		
		calcPage.operador("-");		
		calcPage.obterValor("1");
		calcPage.obterValor("0");
		calcPage.obterResultado();	
		calcPage.validarResultado("40");
	}
	
	@Test
	public void multiplicar(){
		calcPage.obterValor("5");
		calcPage.obterValor("0");		
		calcPage.operador("*");		
		calcPage.obterValor("1");
		calcPage.obterValor("0");
		calcPage.obterResultado();	
		calcPage.validarResultado("500");
	}
	
	@Test
	public void dividir(){
		calcPage.obterValor("5");
		calcPage.obterValor("0");		
		calcPage.operador("/");		
		calcPage.obterValor("1");
		calcPage.obterValor("0");
		calcPage.obterResultado();	
		calcPage.validarResultado("5");
	}
	
	@Test
	public void calcularSemInformarValores(){
		calcPage.operador("+");
		calcPage.obterResultado();	
		calcPage.validarResultado("NaN");
	}
	
	@Test
	public void dividirPorZero(){
		calcPage.obterValor("5");
		calcPage.obterValor("0");		
		calcPage.operador("/");		
		calcPage.obterValor("0");
		calcPage.obterResultado();	
		calcPage.validarResultado("Infinity");
	}
}