package integracao.calculadora;

import integracao.soma.Soma;
import integracao.subtracao.Subtracao;

public class Calculadora {

	private Soma soma;
	private Subtracao subtracao;

	public Calculadora(Soma soma) {
		this.soma = soma;
	}
	
	public Calculadora(Subtracao subtracao) {
		this.subtracao = subtracao;
	}

	public Soma getSoma() {
		return soma;
	}

	public void setSoma(Soma soma) {
		this.soma = soma;
	}

	public Subtracao getSubtracao() {
		return subtracao;
	}

	public void setSubtracao(Subtracao subtracao) {
		this.subtracao = subtracao;
	}
}