package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		/*
		 * String frase = "Boa tarde ?"; frase = frase.toUpperCase(); frase =
		 * frase.replace("?", "Maria"); frase = frase.concat("!");
		 * 
		 * System.out.println(frase);
		 * 
		 */

		String s = "Bom dia ?".toUpperCase().replace("?", "Bia").concat("!");

		System.out.println(s);

		String msg = "não grite, pelo amor de Deus!".toUpperCase();
		System.out.println(msg);
	}

}
