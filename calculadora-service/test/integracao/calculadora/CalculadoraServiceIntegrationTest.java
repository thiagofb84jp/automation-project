package integracao.calculadora;

import org.junit.jupiter.api.Test;

public class CalculadoraServiceIntegrationTest {
	
	private CalculadoraService calcService = new CalculadoraService();
	
	@Test
	public void somar() {
		int x = 10;
		int x1 = "10";
		
		int y = 20;
		int y1 = "20";
		
		Calculadora calc1 = calcService.somar(x, y);
		Calculadora calc2 = calcService.somar(x1, y1);
		
		
	}
	

}
