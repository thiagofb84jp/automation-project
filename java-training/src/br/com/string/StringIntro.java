package br.com.string;

public class StringIntro {
	
	public static void main(String[] args) {
		String name = "Anshul Chauhan";
		String name1 = "Anshul Chauhan";
		String name2 = "anshul chauhan";
		
		String country = new String("United States");
		String country1 = new String("United States");
		/*
		System.out.println("Name: " + name);
		System.out.println("Country: " + country);
		
		System.out.println(name.equals(name1)); //It compares two String values (return true)
		System.out.println(name.equals(name2)); //It compares two String values (return false)
		
		System.out.println(name.equalsIgnoreCase(name2));//It compares two String values ignoring case element (return true)
		
		System.out.println(country.equals(country1));// return true
		*/
		
		/*
		System.out.println(name == name1); // return true
		System.out.println(country == country1); // return false
		*/
		
		/*Concatenating Strings
		 * The example above will print the same value*/
		String finalString = name + name1 + name2;
		System.out.println(finalString);
		
		String secString = name.concat(name1).concat(name2);
		System.out.println(secString);
	}
}