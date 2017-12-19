package br.pb.desafiosjava;

public class Potencia {

	/*
	 * Escreva um programa para calcular e exibir o valor de x y , sendo dados a
	 * base (x) e o expoente (y).
	 */

	public static void main(String[] args) {
		int base = 10;
		int expoente = 2;
		int potencia;

		potencia = (int) Math.pow(base, expoente);

		System.out.println("Potência = " + potencia);

	}
}
