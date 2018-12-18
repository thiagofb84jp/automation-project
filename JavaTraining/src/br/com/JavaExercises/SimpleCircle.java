package br.com.JavaExercises;

public class SimpleCircle {

	private double radius;

	public SimpleCircle() {
		this.radius = 1.0;
	}

	public SimpleCircle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + "]";
	}
	
	public double getCircumference() {
		return 2 * Math.PI + radius;
	}
}