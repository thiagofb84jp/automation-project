package controle;

public class Continue {

	public static void main(String[] args) {
		externo: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					continue externo;
				}
				System.out.println(i + " " + j);
			}

		}
		System.out.println("Fim do programa.");
	}

}