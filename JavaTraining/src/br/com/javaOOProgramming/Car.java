package br.com.javaOOProgramming;

public class Car {
	
	String name = "Car Segment";
	
	Car(){
		System.out.println("Creating Constructor of Car Class");
	}
	
	public final void setWheels() {
		System.out.println("Only 4 Wheels are allowed");
	}
	
	public void run() {
		System.out.println("Car is running");
		System.out.println("Vrum! Vrum! Vruuuuum!");
	}	
}