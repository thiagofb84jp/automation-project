package br.com.string;

public class StringMethodPartI {
	
	public static void main(String[] args) {
		
		//String text = "Learning is the key";
		String text = "Hi we are learning from easybix.com";
		/*
		 * Learning about the method "String chartAt()"
		char ch = text.charAt(12);
		
		System.out.println(text.charAt(10));
		System.out.println(ch);
		
		System.out.println(text.charAt(50));
		*/
		
		/*
		 * Learning about the method "String concat()"
		String text2 = text.concat(" to sucess").concat(" and we learning Java");
		System.out.println(text2);
		*/
		
		/*
		 * Learning about the method "String contains()"
		System.out.println(text.contains("key"));
		*/
		
		System.out.println("Message ending with .com (result will equals = " + text.endsWith("m") + ")");		
	}
}