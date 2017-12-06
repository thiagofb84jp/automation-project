package fundamentos;

public class ConversaoNumerica {

	public static void main(String[] args) {
		/*
		 * Quando há a possibilidade de perda de informação, o Java exige que seja feito
		 * um "cash", ou seja pede-se que informe o tipo da variávei entre parênteses
		 * Exemplo: int a = (int) 5.9;
		 * 
		 */

		// Exemplo 1: Conversão explícita
		float f = (float) 0.1;
		System.out.println(f);

		// Exemplo 2: Conversão explícita
		int i1 = (int) 7.9;
		System.out.println(i1);

		// Exemplo 3: Conversão implícita
		int i2 = 'a';
		System.out.println(i2);

		// Exemplo 4: Conversão implícita
		double d = 1001;
		System.out.println(d);

	}
}