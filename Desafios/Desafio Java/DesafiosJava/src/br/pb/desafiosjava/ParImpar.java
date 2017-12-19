package br.pb.desafiosjava;

import java.util.Scanner;

public class ParImpar {

	/*
	 *
	 * Escreva um programa que leia um número inteiro e determine se ele é par ou
	 * ímpar.
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		double valor = 0;

		num = scanner.nextInt();

		valor = num % 2;

		if (valor == 0) {
			System.out.println("O número " + num + " é par.");
		} else {
			System.out.println("O número " + num + " é ímpar.");
		}

		scanner.close();
		System.out.println("Fim do programa.");

	}

}