package oo.heranca;

public class Carro {
	/*
	 * Quando um método é 'final', significa dizer que esse método é uma constante,
	 * não podendo ser modificado pelas classes filhas; ou seja, este não pode ser
	 * sobrescrito.
	 * 
	 * Os métodos 'protected' são métodos que foram desenhados para serem usados nas classes filhas. 
	 * Mesmo que a classe filha (a classe que herda de 'Carro' esteja em um pacote diferente, ela terá 
	 * acesso a esses dois métodos.
	 */

	protected int VELOCIDADE_MAXIMA = 200;
	private int velocidadeAtual = 0;

	protected final void acelerarMais(int velocidade) {
		if (velocidadeAtual + velocidade > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += velocidade; // velocidadeAtual = velocidadeAtual + velocidade;
		}
	}

	protected final void frearMais(int velocidade) {
		if(velocidadeAtual - velocidade < 0) {
			velocidadeAtual = 0;
		}else {
			velocidadeAtual -= velocidade; // velocidadeAtual = velocidadeAtual - velocidade;
		}
	}
	
	public void acelerar() {
		acelerarMais(5);
	}
	
	public void freiar() {
		frearMais(5);
	}
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
}
