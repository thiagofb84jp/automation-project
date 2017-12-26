package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	/*
	 * O HashSet não respeitará a ordem de inserção. Já o LinkedHashSet respeitará a
	 * ordem de inserção. O TreeSet respeitará a ordem alfabética dos itens
	 */

	public static void main(String[] args) {
		Set<String> aprovados = new TreeSet<String>();
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		aprovados.add("Amanda");

		// 'For' no qual irá exibir a lista completa dos aprovados
		for (String nome : aprovados) {
			System.out.println(nome);
		}
	}

}
