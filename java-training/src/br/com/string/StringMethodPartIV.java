package br.com.string;

public class StringMethodPartIV {

	public static void main(String[] args) {
		String text = "United State";
		
		/*
		 * Learning about the method "String substring()" 
		System.out.println(text.substring(5));
		System.out.println(text.substring(5, 9));
		
		System.out.println(text.substring(5, 20)); // Out of value
		*/
		
		/*
		 * Learning about the method "String toCharArray()
		char[] charArray = text.toCharArray();
		
		System.out.println("Main String is : " + text);
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		*/
		
		/*
		 * Learning about the method "String toUpperCase() e toLowerCase()"
		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());
		*/
		
		/*
		 * Learning about the method "String trim()" 
		String text1 = "My name is                      ";
		String text2 = "                     Anshul";
		
		System.out.println(text1 + text2);
		System.out.println(text1.trim() + text2);
		System.out.println(text1.trim() + text2.trim());
		*/		
	}
}