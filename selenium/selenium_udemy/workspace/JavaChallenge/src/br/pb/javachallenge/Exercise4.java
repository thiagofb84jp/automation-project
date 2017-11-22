package br.pb.javachallenge;

public class Exercise4 {

	public static void main(String[] args) {
		/*
		 * 4. Write a Java program to print the result of the following operations.
		 */

		int a = -5, b = 8, c = 6, total1;
		total1 = a + b * c;
		System.out.println("First Total = " + total1);

		int x = 55, y = 9, z = 9, total2;
		total2 = (x + y) % z;
		System.out.println("Second Total = " + total2);

		int d = 20, e = -3, f = 5, g = 8, total3;
		total3 = d + e * f / g;
		System.out.println("Third Total = " + total3);
		
		int h = 5, i = 15, j = 3, k = 2, l = 8, m = 3, total4;
		total4 = h + i / j * k - l % m;
		System.out.println("Fourth Total = " + total4); 
	}
}
