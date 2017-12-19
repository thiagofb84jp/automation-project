package br.pb.desafiosjava;

public class AumentaSalario {

	public static void main(String[] args) {
		String nome = "Joseano da Silva Santos";
		double salarioAtual = 950.00;
		double salarioReajustado;
		
		if(salarioAtual < 1000.0) {
			salarioReajustado = salarioAtual + salarioAtual * 0.20;
			System.out.println("a) Nome: " + nome);
			System.out.println("b) Salário atual: " + salarioAtual);
			System.out.println("c) Novo Salário: " + salarioReajustado);
		}else if((salarioAtual >= 1000.01) && (salarioAtual <= 5000.00)) {
			salarioReajustado = salarioAtual + salarioAtual * 0.10;
			System.out.println("a) Nome: " + nome);
			System.out.println("b) Salário atual: " + salarioAtual);
			System.out.println("c) Novo Salário: " + salarioReajustado);			
		}else {
			salarioReajustado = salarioAtual + salarioAtual * 0.00;
			System.out.println("a) Nome: " + nome);
			System.out.println("b) Salário atual: " + salarioAtual);
			System.out.println("c) Novo Salário: " + salarioReajustado);
		}
	}

}