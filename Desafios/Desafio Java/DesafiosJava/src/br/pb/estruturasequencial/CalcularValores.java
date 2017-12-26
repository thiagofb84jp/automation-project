package br.pb.estruturasequencial;

public class CalcularValores {
	
	public static void main(String[] args) {
		int a = 10, b = 2, res1;
		double c = 10.0, res2, res3;
		
		res1 = (a * 2) * (b / 2);
		System.out.println("Produto do dobro do primeiro com a metade do segundo: " + res1);
		
		res2 = (a * 3) + c;
		System.out.println("A soma do triplo do primeiro com o terceiro: " + res2);
		
		res3 = Math.pow(c, 3);
		System.out.println("O terceiro elevado ao cubo: " + res3);
	}

}
