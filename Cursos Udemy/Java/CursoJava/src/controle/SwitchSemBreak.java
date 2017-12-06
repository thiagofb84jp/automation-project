package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		/*
		 * Forma de usar o Switch que é muito difícil de ocorrer
		 * 
		 */
		String faixa = "preta";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei fazer o 'Grupo I de lutas'");
		case "marrom":
			System.out.println("Sei fazer o Grupo II de lutas'");
		case "roxa":
			System.out.println("Sei fazer o 'Grupo III de lutas'");
		case "verde":
			System.out.println("Sei fazer o 'Grupo IV de lutas'");
		case "laranja":
			System.out.println("Sei fazer o 'Grupo V de lutas'");
		case "vermelha":
			System.out.println("Sei fazer o 'Grupo VI de lutas'");
		case "amarela":
			System.out.println("Sei fazer o 'Grupo VII de lutas'");
//		default:
//			System.out.println("Não consigo fazer nada.");
		}
	}

}