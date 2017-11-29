package fundamentos;

public class ObjetosPrimitivos {

	public static void main(String[] args) {
		/*
		 * A tradução correta para esta classe é "Wrapper (Objetos Primitivos)". Existem
		 * 8 (oito) tipos de Wrappers relativos a um tipo primitivo
		 */
		Character c = 'a';
		Boolean bo = true;

		Byte b = 1;
		Short s = 2;
		Integer i = 3;
		Long l = 4L;

		Float f = 5.1f;
		Double d = 6.1;

		System.out.println(bo.toString().length());
		System.out.println("Tamanho da String: " + "true".length());
	}

}