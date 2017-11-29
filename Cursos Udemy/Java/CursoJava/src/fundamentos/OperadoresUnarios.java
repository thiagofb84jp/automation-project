package fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;

		// Incremento
		num1++; // num1 = num1 + 1;
		System.out.println(num1);

		// Decremento
		num1--;
		System.out.println(num1);

		System.out.println(++num1 == num2--);// Trata-se de uma péssima prática de programação
		System.out.println(num1 == num2);

		System.out.println(num1);
		System.out.println(num2);

		// Complemento binário
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50));

		// Negação lógica
		System.out.println(!false);
		System.out.println(!true);
	}

}
