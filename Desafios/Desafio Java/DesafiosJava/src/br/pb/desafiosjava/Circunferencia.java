package br.pb.desafiosjava;

public class Circunferencia {

	/*
	 * Escreva um programa para calcular e exibir o comprimento de uma
	 * circunferência, sendo dado o valor de seu raio.
	 */

	static final double PI = 3.1416;

	public static void main(String[] args) {

		double raio = 4.5;
		double circ;

		circ = 2 * PI * (raio * raio);

		System.out.printf("Valor da circunferência: %.4f", circ);
	}
}
