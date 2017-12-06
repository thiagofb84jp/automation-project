package controle;

import java.util.Scanner;

public class WhileDeterminado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;

		int indice = 0;

		while (indice < 3) {
			nota = scanner.nextDouble();
			somaDasNotas += nota; // somaDasNotas = somaDasNotas + nota;
			indice++; // indice = indice + 1;
		}

		scanner.close();
//		System.out.println("A soma das notas = " + somaDasNotas);
		System.out.printf("A média é %.2f", somaDasNotas / 3);
	}
}
