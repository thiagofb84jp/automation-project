package classe;

public class OperadoresTeste {

	public static void main(String[] args) {

		Operadores op = new Operadores();

		System.out.println("********** Operadores **********");
		System.out.println("Soma: " + op.soma(9, 1));
		System.out.println("Subtração: " + op.subtracao(9, 1));
		System.out.println("Multiplicação: " + op.multiplicacao(9, 2));
		System.out.println("Divisão: " + op.divisao(10, 2));
	}
}
