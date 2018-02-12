package br.pb.estruturadecisao;

public class MediaAluno {

	public static void main(String[] args) {
		int nota1 = 10, nota2 = 10, media;

		media = (nota1 + nota2) / 2;

		if (media == 10) {
			System.out.println("Aprovado com distinção");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}
