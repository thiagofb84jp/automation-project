package br.com.exceptionHandling;

public class MultiCatch {
	
	public static void main(String[] args) {
		try {
			int value = 100;
			int result = value / 0;
			System.out.println(result);
			
			String text = null;
			int length = text.length();
			System.out.println(length);
		} catch (ArithmeticException e) {
			System.out.println("Declare specific exception");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Generic Catch Block");
		}
	}
}