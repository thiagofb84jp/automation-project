package br.pb.estruturasequencial;

public class TempCelsius {

	public static void main(String[] args) {
		
		double celsius, farenheit = 212.0;

		celsius = 5 * ((farenheit - 32) / 9);

		System.out.println("Temperatura (ºC) = " + celsius);
	}

}
