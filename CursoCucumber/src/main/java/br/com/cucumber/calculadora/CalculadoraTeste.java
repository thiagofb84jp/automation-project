package br.com.cucumber.calculadora;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		calc.setVlr1(10);
		calc.setVlr2(20);
		
		System.out.println(calc.somar());
	}
	
}
