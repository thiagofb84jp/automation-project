package br.com.javaOOProgramming;

public class Circle extends Shape{

	@Override
	public void displayShape() {
		System.out.println("Shape is a Circle");
	}
	
	public static void main(String[] args) {
		Shape s1 = new Circle();
		Shape s2 = new Triangle();
		
		s1.displayName();
		s2.displayName();
	}
}