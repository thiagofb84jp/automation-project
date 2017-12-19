package br.pb.desafiosjava;

public class MenorNumero {

	/*
	 * Escreva um programa para ler três números inteiros distintos e determinar o
	 * menor deles.
	 */

	public static void main(String[] args) {
		int a = -6;
		int b = 28;
		int c = -100;

		if ((a < b) && (a < c)) {
			System.out.println("O número " + a + " é o menor deles.");
		} else if ((b < a) && (b < c)) {
			System.out.println("O número " + b + " é o menor deles.");
		} else {
			System.out.println("O número " + c + " é o menor deles.");
		}
	}

}
