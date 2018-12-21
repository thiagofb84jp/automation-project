package br.com.examplesInterface;

public class CalculadoraSimplesTeste {
	
	public static void main(String[] args) {
		CalculadoraSimples calc = new CalculadoraSimples(10, 5);
		
		System.out.println("Soma: " + calc.somar());
		System.out.println("Subtração: " + calc.subtrair());
		System.out.println("Multiplicação: " + calc.multiplicar());
		System.out.println("Divisão: " + calc.dividir());
	}
}