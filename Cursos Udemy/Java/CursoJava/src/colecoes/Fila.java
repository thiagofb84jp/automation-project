package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		/*
		 * A fila pode pegar um elemento que chegou depois, pegando o primeiro elemento
		 * que chegou na fila
		 */
		Queue<String> fila = new LinkedList<>();

		fila.offer("João"); // Caso ele não consiga adicionar um elemento na fila, ele retorna um 'false'
		fila.offer("Maria");
		fila.add("Pedro"); // Caso ele não consiga adicionar um elemento na fila, ele retorna uma exceção

		System.out.println("Peek/Element...");
		System.out.println(fila.peek());// Captura o primeiro elemento da fila
		System.out.println(fila.element()); // Captura o próximo componente da fila

		System.out.println("Pool/Remove...");
		System.out.println(fila.poll()); // Captura o primeiro elemento da fila e remove-o
		System.out.println(fila.remove()); // Remove o segundo elemento da fila
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // Neste, o último valor será 'null'
		System.out.println(fila.remove()); // Neste, será lançada uma exceção
	}
}