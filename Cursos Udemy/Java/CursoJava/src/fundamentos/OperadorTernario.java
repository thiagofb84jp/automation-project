package fundamentos;

public class OperadorTernario {

	public static void main(String[] args) {
		/*
		 * Operador Ternário é conhecido também como "Atribuição Condicional". No caso
		 * do código abaixo, está sendo feita uma atribuição para a String "resultado";
		 */
		double nota = 8.0;
		String resultado = nota >= 7.1 ? "Aprovado" : "Recuperação";
		System.out.println("Valor = " + resultado);
	}
}