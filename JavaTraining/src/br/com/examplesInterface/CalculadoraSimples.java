package br.com.examplesInterface;

public class CalculadoraSimples implements IntCalculadoraSimples {

	private int valor1;
	private int valor2;
	
	public CalculadoraSimples(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	@Override
	public int somar() {
		return valor1 + valor2;
	}

	@Override
	public int subtrair() {
		return valor1 - valor2;
	}

	@Override
	public int multiplicar() {
		return valor1 * valor2;
	}

	@Override
	public float dividir() {
		return valor1 / valor2;
	}

}
