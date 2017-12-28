package br.pb.estruturasequencial;

public class PesoIdealHM {

	public static void main(String[] args) {
		char sexo = 'H';
		double altura = 1.95, pesoIdeal = 0.0, peso = 110.0, massa = 0.0;

		if (sexo == 'H') {
			pesoIdeal = (72.7 * altura) - 58;
			System.out.println("Seu peso ideal: " + pesoIdeal);
		} else if (sexo == 'M') {
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.println("Seu peso ideal: " + pesoIdeal);
		} else {
			System.out.println("Por favor, informe o sexo corretamente.");
		}

		massa = peso / (altura * altura);

		if (massa < 26) {
			System.out.println("Peso normal.");
		} else if ((massa >= 26) && (massa < 30)) {
			System.out.println("Obeso.");
		} else {
			System.out.println("Obeso mórbido.");
		}
	}
}
