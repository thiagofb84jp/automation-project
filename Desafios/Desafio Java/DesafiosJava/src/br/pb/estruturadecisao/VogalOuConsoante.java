package br.pb.estruturadecisao;

public class VogalOuConsoante {

	public static void main(String[] args) {
		char letra = 'b';

		if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')) {
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		}
	}

}
