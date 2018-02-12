package br.pb.estruturadecisao;

public class MaiorEMenorNumero {

	public static void main(String[] args) {

		int x = 10, y = 90, z = 100;

		if ((x > y) && (x > z)) {
			System.out.println("X é maior.");
		} else if ((y > x) && (y > z)) {
			System.out.println("Y é maior.");
		} else {
			System.out.println("Z é maior.");
		}

		if ((x < y) && (x < z)) {
			System.out.println("X é menor.");
		} else if ((y < x) && (y < z)) {
			System.out.println("Y é menor.");
		} else {
			System.out.println("Z é menor.");
		}
	}
}
