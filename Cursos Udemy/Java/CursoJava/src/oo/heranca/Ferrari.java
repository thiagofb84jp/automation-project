package oo.heranca;

public class Ferrari extends Carro {
	
	/*
	 * Pode-se verificar que, neste caso, ocorreu a sobrescrita do método 'acelerarMais', ou seja, do método pai.
	 * Com isso, é possível alterar um comportamento específico da classe pai, sendo possível realizar a sobrescrita
	 * por completo ou partes do mesmo.
	 */

	public Ferrari() {
		VELOCIDADE_MAXIMA = 350;
	}

	public void acelerar() {
		// O 'super' é uma das formas de se usar o método da classe pai
		super.acelerarMais(20);
	}
}
