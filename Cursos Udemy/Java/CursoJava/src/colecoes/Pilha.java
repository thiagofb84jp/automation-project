package colecoes;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		/*
		 * Na pilha, o último elemento que entrou será o último a sair.
		 */

		Stack<String> pilha = new Stack<>();
		// Deque<String> pilha = new ArrayDeque<>(); // Possui as mesmas funcionalidades
		// da 'Pilha'

		pilha.push("O Pequeno Príncipe");
		pilha.push("O Hobbit");
		pilha.push("O Mundo de Sofia");
		pilha.push("Dom Quixote");

		System.out.println("Peek...");
		System.out.println(pilha.peek()); // Pega o primeiro elemento da pilha

		System.out.println("Pop...");
		System.out.println(pilha.pop()); // Retira o elemento da pilha
		System.out.println(pilha.pop()); // Retira o elemento da pilha
		System.out.println(pilha.pop()); // Retira o elemento da pilha
		System.out.println(pilha.pop()); // Retira o elemento da pilha
		// System.out.println(pilha.pop()); // Neste caso, ele retornará um erro
	}
}
