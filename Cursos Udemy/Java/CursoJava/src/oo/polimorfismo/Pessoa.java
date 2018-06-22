package oo.polimorfismo;

public class Pessoa {

	/**
	 * Peso em Kg O tipo de Polimorfismo praticado nesta classe é o 'Polimorfismo
	 * Estático'. O que ocorre é a sobrecarga de métodos (métodos que possuem o
	 * mesmo nome, só que recebendo parâmetros diferentes), sendo diferente de
	 * SOBRESCRITA.
	 */
	private double peso = 0;

	public Pessoa(double pesoInicial) {
		this.peso = pesoInicial;
	}

	public double getPeso() {
		return peso;
	}
	
	//Está sendo passado na variável 'Comida...' vários valores (varargs)
	public void comer(Comida... comidas) {
		for(Comida c: comidas) {
			this.peso += c.getPeso();
		}
	}

	//Produção de métodos estáticos
//	public void comer(Arroz arroz) {
//		this.peso += arroz.getPeso();
//	}
//
//	public void comer(Feijao feijao) {
//		this.peso += feijao.getPeso();
//	}
//	
//	public void comer(Sorvete sorvete) {
//		this.peso += sorvete.getPeso();
//	}
}