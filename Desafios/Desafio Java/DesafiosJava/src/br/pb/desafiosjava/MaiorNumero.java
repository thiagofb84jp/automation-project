package br.pb.desafiosjava;

import java.util.Scanner;

public class MaiorNumero {

	/*
	 * Escreva um programa que leia dois números e exiba o maior deles.
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;

		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		if (num1 > num2) {
			System.out.println("Número " + num1 + " é maior que número " + num2);
		} else {
			System.out.println("Número " + num2 + " é maior que número " + num1);
		}

		scanner.close();
		System.out.println("Fim do programa.");
	}

}
