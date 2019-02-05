package br.com.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
	
	public static void main(String[] args) {
		// Create a vector and print its contents
		Vector v = new Vector();
		for (int i = 0; i < 10; i++){
			v.addElement(i);
		}			
		
		// It will print these elements: [0, 1, 2, 3, 4...]
		System.out.println(v);
		
		// At beginning e(cursor) will point to
		// index just before the first element in v
		Enumeration e = v.elements();

		// Checking the next element availability
		while (e.hasMoreElements()) {
			// moving cursor to next element
			int i = (Integer) e.nextElement();

			//It will print one by one of the elements of the vector class
			System.out.print(i + " ");
		}
	}
}