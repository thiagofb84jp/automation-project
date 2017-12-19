package br.pb.desafiosjava;

public class Celsius {

	/*
	 * Escreva um programa para ler uma temperatura dada na escala Fahrenheit e
	 * exibir o equivalente em Celsius.
	 */

	public static void main(String[] args) {
		double celsius;
		double fahr = 212.0;

		celsius = 5 * (fahr - 32) / 9;

		System.out.println("Temperatura média (ºC) = " + celsius);
	}

}
