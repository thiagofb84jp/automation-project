package br.pb.estruturasequencial;

public class RendimentoDiarioTrabalho {

	public static void main(String[] args) {
		double pesoPeixes = 50.0;

		if (pesoPeixes > 50) {
			double excesso = 0.0, multa = 0.0;
			excesso = pesoPeixes - 50;
			multa = excesso * 4;
			System.out.println(
					"Deu excesso de " + excesso + " peixes. Você deverá pagar a multa de R$ " + multa + " reais");
		} else {
			String excesso = "ZERO", multa = "ZERO";
			System.out.println("Não deu excesso de peixes ("+ excesso +"). Você não deverá pagar nada (" + multa + ").");
		}
	}
}
