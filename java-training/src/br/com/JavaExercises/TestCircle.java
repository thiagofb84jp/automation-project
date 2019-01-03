package br.com.JavaExercises;

public class TestCircle {

	//Exercise 1.1 (NTU)
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

		Circle c2 = new Circle(2.0);
		System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
		
		Circle c3 = new Circle(3.0, "Red");
		System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea() + " and the following color: " + c3.getColor());
		
		Circle c4 = new Circle();
		c4.setColor("Blue");
		c4.setRadius(4.0);
		System.out.println("The circle has radius of " + c4.getRadius() + " and area of " + c4.getArea() + " and the following color: " + c4.getColor());
		
		Circle c5 = new Circle(5.0, "Green");
		System.out.println(c5.toString());
	}
}