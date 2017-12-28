package br.pb.estruturasequencial;

public class CalculaSalarioMensal {

	public static void main(String[] args) {
		double valorHora = 7.50, horaTrabalhada = 220, salBruto, impRenda, INSS, sindic, valDescontos, salLiquido;

		salBruto = valorHora * horaTrabalhada;

		impRenda = salBruto * 0.11;
		INSS = salBruto * 0.08;
		sindic = salBruto * 0.05;

		valDescontos = impRenda + INSS + sindic;
		salLiquido = salBruto - valDescontos;

		System.out.println("Seu salário bruto é: (R$) " + salBruto);
		System.out.println("IR: (R$) " + impRenda);
		System.out.println("INSS: (R$) " + INSS);
		System.out.println("Sindicato: (R$) " + sindic);

		System.out.println("Seu salário líquido é: (R$) " + salLiquido);
	}
}