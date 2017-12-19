package br.pb.desafiosjava;

public class GrauObesidade {

	public static void main(String[] args) {
		double massa, peso = 90, altura = 1.75;

		massa = peso / (altura * altura);

		if (massa < 26.0) {
			System.out.println("Normal");
		} else if ((massa >= 26.0) && (massa < 30)) {
			System.out.println("Obeso");
		} else {
			System.out.println("Obeso Mórbido");
		}
	}

}
