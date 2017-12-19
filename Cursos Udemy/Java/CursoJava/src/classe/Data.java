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

	/*
	 * Este 'this' representa um construtor
	 */
	Data() {
		this(1, 1, 2017);
	}

	/*
	 * A palavra 'this' significa a instância que está sendo criada neste momento,
	 * sendo uma forma de diferenciar as variáveis de instância, significando o
	 * objeto atual que está sendo executado no momento
	 */
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String formatar() {
		return String.format("%d/%d/%d", this.dia, mes, ano);
	}

}
