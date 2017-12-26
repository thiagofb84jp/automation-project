package br.pb.estruturasequencial;

public class CalculaSalario {

	public static void main(String[] args) {
		double valorHora = 20, numHorasTrab = 100.0, salBruto, impRenda, inss, sind, valorTotal, salLiquido;

		salBruto = valorHora * numHorasTrab;

		impRenda = salBruto * 0.11;
		inss = salBruto * 0.08;
		sind = salBruto * 0.05;

		valorTotal = impRenda + inss + sind;

		salLiquido = salBruto - valorTotal;

		System.out.println("Seu salário bruto é: (R$)" + salBruto);
		System.out.println("IR: (R$)" + impRenda);
		System.out.println("INSS: (R$)" + inss);
		System.out.println("Sindicato: (R$)" + sind);

		System.out.println("Seu salário líquido é: (R$)" + salLiquido);

	}

}
