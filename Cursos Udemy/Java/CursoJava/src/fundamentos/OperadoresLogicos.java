package fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean executouTrabalho1 = false;
		boolean executouTrabalho2 = true;

		boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
		boolean comprouTv50Pol = executouTrabalho1 && executouTrabalho2;
		boolean comprouTv32Pol = executouTrabalho1 ^ executouTrabalho2;

		System.out.println("Sorvete = " + comprouSorvete);
		System.out.println("TV 50 Polegadas = " + comprouTv50Pol);
		System.out.println("TV 32 Polegadas = " + comprouTv32Pol);

		// Operador unário intruso (!)
		System.out.println("Fome = " + !comprouSorvete);
	}

}