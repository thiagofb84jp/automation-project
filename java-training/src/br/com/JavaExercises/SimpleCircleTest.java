package br.com.JavaExercises;

public class SimpleCircleTest {
	
	public static void main(String[] args) {
		SimpleCircle sc1 = new SimpleCircle();
		System.out.println(sc1.toString());
		System.out.println("Area value = " + sc1.getArea());
		System.out.println("Circumference value = " + sc1.getCircumference());
		
		SimpleCircle sc2 = new SimpleCircle(2.0);
		System.out.println(sc2.toString());
		System.out.println("Area value = " + sc2.getArea());
		System.out.println("Circumference value = " + sc2.getCircumference());
	}
}