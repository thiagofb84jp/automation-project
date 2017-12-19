package br.pb.desafiosjava;

public class MediaConceito {

	/*
	 * Faça um programa que, dado as três notas de um aluno, determine e exiba a sua
	 * média final e o seu conceito, sabendo-se que: - a média final é calculada
	 * pela média aritmética das 3 notas;
	 */

	public static void main(String[] args) {
		double a = 4.9, b = 4.9, c = 4.9, media;

		media = (a + b + c) / 3;

		if (media >= 8.0) {
			System.out.println("Conceito = A");
		} else if ((media >= 5.0) && (media < 8.0)) {
			System.out.println("Conceito = B");
		} else {
			System.out.println("Conceito = C");
		}
	}

}
