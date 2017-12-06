package classe;

public class Data {
	/*
	 * Toda classe Java possui um construtor. Esta pode ter um construtor possuindo
	 * parâmetros ou não. Pode-se ter mais de um construtor em uma mesma classe.
	 * Lembre-se que o que importa em relação aos parâmetros é: sua quantidade,
	 * ordem e o tipo dos mesmos
	 */

	int dia;
	int mes;
	int ano;

	Data() {

	}

	Data(int d, int m, int a) {
		dia = d;
		mes = m;
		ano = a;
	}

	String formatar() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

}
