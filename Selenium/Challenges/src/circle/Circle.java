package circle;

public class Circle {

	private double radius;
	private String color;

	//The default constructor with no argument
	//It sets the radius and color to their default value
	public Circle() {
		radius = 1.0;
		color = "red";
	}

	//2nd constructor with given radius, but color defaut
	public Circle(double r) {
		radius = r;
		color = "red";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//A public method for computing the area of circle
	public double getArea() {
		return radius * radius * Math.PI;
	}
}