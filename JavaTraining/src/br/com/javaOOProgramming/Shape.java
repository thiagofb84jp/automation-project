package br.com.javaOOProgramming;

abstract public class Shape {
	//This method doesn't have any body
	abstract public void displayShape();
	
	public void displayName() {
		System.out.println("From Shape class");
	}
}