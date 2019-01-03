package br.com.javaForBeginners;

public class Students {
	
	int rollNumber;
	String name;
	
	public Students() {
		System.out.println("Hi, I am inside constructor.");
		System.out.println("Hi, I am second method.");
	}
	
	public Students(int i, String n) {
		//Class variable = Method Variable
		this.rollNumber = i;
		this.name = n;
	}
	
	public void display() {
		System.out.println("Roll number is: " + rollNumber + " and name is: " + name);
	}

	public static void main(String[] args) {
		Students std = new Students();
		
		Students std1 = new Students(10203040, "James Smith");
		Students std2 = new Students(50607080, "Natalia");
		
		std1.display();
		std2.display();
	}
}