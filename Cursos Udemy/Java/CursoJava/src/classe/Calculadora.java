package classe;

public class Calculadora {

	double resultado;

	//Parâmetros de entrada + retorno do método
	double somar(double a, double b) {
		resultado = a + b;
		return resultado;
	}

	//Parâmetros de entrada sem nenhum retorno
	void acrescentar(double a) {
		resultado += a; // resultado = resultado + a;
	}

	//Sem parâmetros de entrada mas com um retorno (variável global 'resultado')
	double obterResultado() {
		return resultado;
	}

	//Nenhum parâmetro de entrada e nenhum retorno
	void limpar() {
		resultado = 0;
	}
}