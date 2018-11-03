package simplefieldCircle;

public class CircleTeste {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.getRadius();
		System.out.println(c1.toString());
		
		c1.setRadius(4);
		System.out.println("Area = " + c1.getArea() + " and Circunference = " + c1.getCircumference());
		
		Circle c2 = new Circle(4);
		c2.getRadius();
		System.out.println(c2.toString());
		c2.setRadius(4);
		System.out.println("Area = " + c1.getArea() + " and Circunference = " + c1.getCircumference());
	}
}