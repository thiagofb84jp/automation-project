package br.pb.estruturadecisao;

public class MaiorNumero2 {

	public static void main(String[] args) {
		int x = 10, y = 90, z = 100;

		if ((x > y) && (x > z)) {
			System.out.println("X é maior.");
		} else if ((y > x) && (y > z)) {
			System.out.println("Y é maior.");
		} else {
			System.out.println("Z é maior.");
		}
	}
}
