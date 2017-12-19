package br.pb.desafiosjava;

public class CalcConsumo {

	/*
	 * Deseja-se calcular a conta de consumo de energia elétrica de um consumidor.
	 * Para isto, escreva um programa que leia o código do consumidor, o preço do Kw
	 * e a quantidade de Kw consumido, e exiba o código do consumidor e o total a
	 * pagar. - total a pagar = preço x quantidade - total a pagar mínimo = R$ 11,20
	 */

	public static void main(String[] args) {
		String codConsumidor = "ABCD_2525";
		double precoKW = 5.0;
		double quantKW = 2.2;
		double totalPagar = 0.0;

		totalPagar = precoKW * quantKW;

		if (totalPagar <= 11.20) {
			System.out.println("******** Conta Final ********");
			System.out.println("Código do consumidor: " + codConsumidor);
			System.out.println("Total a pagar (R$): " + 0.0 + " (não foi gerado nenhum consumo.)");
		} else {
			System.out.println("******** Conta Final ********");
			System.out.println("Código do consumidor: " + codConsumidor);
			System.out.println("Total a pagar (R$): " + totalPagar);
		}
		System.out.println("Fim do programa.");

	}

}
