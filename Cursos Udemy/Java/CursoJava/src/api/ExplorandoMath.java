package api;

public class ExplorandoMath {

	/*
	 * A classe Math: 
	 * 1. Possui vários métodos estáticos, ou seja, não é necessário
	 * criar uma instância de Math para usar os métodos que estão contidos; 
	 *
	 */

	public static void main(String[] args) {
		System.out.println(Math.PI); // Exibe o valor de PI (3,1415)
		System.out.println(Math.pow(2, 3)); // Exibe o valor exponencial. Neste exemplo, tem-se o dois elevado ao cubo
		System.out.println(Math.abs(-10.5)); // Exibe o valor absoluto
		System.out.println(Math.min(70, 7)); // Exibe o menor valor
		System.out.println(Math.max(70, 7)); // Exibe o maior valor
		System.out.println(Math.ceil(6.55)); // Método que arredonda os valores 'para cima'
		System.out.println(Math.floor(6.55)); // Método que arredonda os valores 'para baixo'
		System.out.println(Math.random()); // Gera valores aleatórios
	}
}
