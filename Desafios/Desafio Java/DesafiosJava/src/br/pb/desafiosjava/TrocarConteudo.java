package br.pb.desafiosjava;

public class TrocarConteudo {

	/*
	 * Escreva um programa que leia duas variáveis inteiras e troque o conteúdo
	 * entre elas.
	 * 
	 */

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int trocaValor;

		trocaValor = x;
		x = y;
		y = trocaValor;

		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}

}
