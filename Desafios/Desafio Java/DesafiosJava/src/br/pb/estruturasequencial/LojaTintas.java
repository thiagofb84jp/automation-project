package br.pb.estruturasequencial;

public class LojaTintas {

	public static void main(String[] args) {
		int tamArea = 200, litros, precoLitro = 80, capacidade = 18, valorTotal, latas;
		
		litros = tamArea / 3;
		
		latas = litros / capacidade;
		
		valorTotal = latas * precoLitro;
		
		System.out.println("Você precisa usar " + latas + " latas de tinta para pintar " + tamArea + " metros quadrados.");
		System.out.println("O preço total é de: R$ " + valorTotal);
	}
}