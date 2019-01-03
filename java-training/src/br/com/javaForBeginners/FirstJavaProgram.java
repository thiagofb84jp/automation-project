package br.com.javaForBeginners;

public class FirstJavaProgram {
	
	static int varSec = 98765;
	static String name = "John";
	
	boolean isTrue = true;
	boolean isFalse = false;
	
	long phoneNumber = 9876543215L;
	double decimalValues = 234.43D;
	
	//Static class
	public static void firstMethod() {
		int number = 12345;
		String city = "New York";
		
		System.out.println(number);
		System.out.println(city);
		System.out.println(varSec);
	}

	//Object class
	public int sum(int a, int b) {
		return a + b;
	}

	//Main class
	public static void main(String[] args) {
		FirstJavaProgram fjp = new FirstJavaProgram();
		fjp.sum(10, 20);
		
		FirstJavaProgram.firstMethod();
		
		System.out.println("Hey, this is my first program!");
		System.out.println("Hey, I am so to Use");
		System.out.println("What is your name? My name is " + name);
	}
}