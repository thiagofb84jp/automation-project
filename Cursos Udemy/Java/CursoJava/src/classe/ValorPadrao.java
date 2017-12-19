package classe;

public class ValorPadrao {

	static int a;
	static boolean b;

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);

		// Lembre-se que uma variável local precisa ser inicializada de forma explícita
		// Elas não são inicializadas com nenhum valor. É preciso informá-los de forma explícita
		Object b = null;
		System.out.println(b);
	}
}
