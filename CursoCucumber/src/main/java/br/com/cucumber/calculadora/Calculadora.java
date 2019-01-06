package br.com.cucumber.calculadora;

public class Calculadora {

	private int vlr1;
	private int vlr2;

	public Calculadora() {
		
	}
	
	public int getVlr1() {
		return vlr1;
	}

	public void setVlr1(int vlr1) {
		this.vlr1 = vlr1;
	}

	public int getVlr2() {
		return vlr2;
	}

	public void setVlr2(int vlr2) {
		this.vlr2 = vlr2;
	}

	public int somar() {
		return vlr1 + vlr2;
	}

	public int subtrair() {
		return vlr1 - vlr2;
	}
	
	public int multiplicar() {
		return vlr1 * vlr2;
	}
	
	public int dividir() {
		return vlr1 / vlr2;
	}
}