package br.pb.desafiosjava;

public class AreaTriangulo {

	/*
	 * Escreva um programa para calcular a área de um triângulo, sendo dados a sua
	 * base e a sua altura.
	 * 
	 */

	public static void main(String[] args) {
		double area;
		double base = 5.2;
		double altura = 2.2;

		area = (base * altura) / 2;

		System.out.printf("A área do triângulo é de: %.2f", area);
	}

}
