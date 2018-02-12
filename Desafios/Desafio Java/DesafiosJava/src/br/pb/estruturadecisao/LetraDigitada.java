package br.pb.estruturadecisao;

public class LetraDigitada {
	
	public static void main(String[] args) {
		char sexo = 'I';
		
		if (sexo == 'F') {
			System.out.println("F - Feminino");
		}else if(sexo == 'M') {
			System.out.println("M - Masculino");
		}else {
			System.out.println("Sexo Inválido");
		}
	}
}