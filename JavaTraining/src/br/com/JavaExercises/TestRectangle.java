package br.com.JavaExercises;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println(r1.toString());
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
		
		Rectangle r2 = new Rectangle(2.0f, 3.0f);
		System.out.println(r2.toString());
		System.out.println(r2.getArea());
		System.out.println(r2.getPerimeter());
	}
}