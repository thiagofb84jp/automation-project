package colecoes;

public class Array {

	public static void main(String[] args) {
		// Forma de criar um array inserindo os valores
		double[] notasJoao = { 7.0, 8.7, 6.2, 4.9, 9.7 };

		// Forma de criar um array utilizando um construtor
		double[] notasPedro = new double[5];
		notasPedro[0] = 7.0;
		notasPedro[1] = 8.7;
		notasPedro[2] = 6.2;
		notasPedro[3] = 4.9;
		notasPedro[4] = 9.7;

		// Utilização do Foreach para o uso de arrays
		double totalJoao = 0;
		for (double nota : notasJoao) {
			totalJoao += nota;
		}
		// for (int i = 0; i < notasJoao.length; i++) {
		// totalJoao += notasJoao[i]; // totalJoao = totalJoao + notasJoao
		// }

		// Utilização do Foreach para o uso de arrays
		double totalPedro = 0;
		for (double nota : notasPedro) {
			totalPedro += nota;
		}
		// for (int i = 0; i < notasPedro.length; i++) {
		// totalPedro += notasPedro[i]; // totalPedro = totalPedro + notasPedro
		// }

		System.out.println(totalJoao / notasJoao.length);
		System.out.println(totalPedro / notasPedro.length);
	}
}
