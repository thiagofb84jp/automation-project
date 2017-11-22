package br.pb.javachallenge;

public class Exercise6 {

	public static void main(String[] args) {

		/*
		 * 6. Write a Java program to print the sum (addition), multiply, subtract,
		 * divide and remainder of two numbers.
		 */

		int a = 125, b = 24, addition, subtraction, multiplication, division, mod;

		addition = a + b;
		subtraction = a - b;
		multiplication = a * b;
		division = a / b;
		mod = a % b;

		System.out.println("Addition = " + addition);
		System.out.println("Subtraction = " + subtraction);
		System.out.println("Multiplication = " + multiplication);
		System.out.println("Division = " + division);
		System.out.println("Mod = " + mod);

	}
}
