package oo.polimorfismo;

public class Comida {
	
	// As teclas ALT + SHIFT +J irão criar um @Javadoc
	/**
	 * Peso em Kg
	 */
	private double peso = 0; // Lembre-se que, apenas a classe 'Comida' possui acesso a essa variável
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;
		}
	}
}