package fundamentos;

public class VariaveisEConstantes {

	public static void main(String[] args) {
		double raioCircunferencia = 4.5;
		final double PI = 3.1416;

		double area = PI * raioCircunferencia * raioCircunferencia;

		System.out.println("A área é: " + area + " m²");
		// Imprime o valor de forma formatada
		System.out.printf("Área é %f m².\n", area);
		// Imprime o valor de forma que o valor seja arredondado
		System.out.printf("Área é %.2f m².", area);
	}
	
}