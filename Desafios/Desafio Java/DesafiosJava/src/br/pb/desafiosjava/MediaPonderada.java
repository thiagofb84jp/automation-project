package br.pb.desafiosjava;

public class MediaPonderada {

	/*
	 * Escreva um programa para calcular e exibir a média ponderada de duas notas
	 * dadas.
	 * 
	 */

	public static void main(String[] args) {
		double media;
		double nota1 = 5.5;
		double nota2 = 9.0;
		int peso1 = 6;
		int peso2 = 4;

		media = ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2);

		System.out.println("Média ponderada = " + media);
	}

}
