package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		/*
		 * O mapa é uma estrutura chave/valor
		 */
		Map<Integer, String> aprovados = new HashMap<>();
		aprovados.put(1, "Pedro");
		aprovados.put(2, "Maria");
		aprovados.put(3, "João");
		aprovados.put(4, "Carlos");

		System.out.println(aprovados.keySet());// As chaves são organizadas em um Keyset
		System.out.println(aprovados.values()); // Neste serão exibidos apenas os valores
		System.out.println(aprovados.entrySet());// Exibe o conjunto completo dos valores [ chave = valor ]

		aprovados.put(3, "Beatriz");
		System.out.println(aprovados.get(3));// Pega o elemento pela chave

		System.out.println(aprovados.containsKey(4));
		System.out.println(aprovados.containsValue("João"));

		System.out.println("Chaves..."); // Exibe todas as chaves dos códigos dos aprovados
		for (Integer codigo : aprovados.keySet()) {
			System.out.println(codigo);
		}

		System.out.println("Valores"); // Exibe todos os nomes/valores dos aprovados
		for (String nome : aprovados.values()) {
			System.out.println(nome);
		}
		
		System.out.println("Chaves/Valores..."); // Exibe os registros + valores
		for(java.util.Map.Entry<Integer, String> registro: aprovados.entrySet()){
			System.out.println(registro.getKey() + " " + registro.getValue());
		}
	}
}