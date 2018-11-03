package circle;

public class CircleTeste {
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
		System.out.println(c1.toString()); // Chamada explícita do método 'toString'
		
		Circle c2 = new Circle(2.0);
		System.out.println(c2.toString()); //Chamada explícita do método
		System.out.println(c2); //println() chama o método de forma implícita
		System.out.println("Operator '+' invokes toString() too: " + c2); //Utiliza outra forma de invocar o método
		System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
		
		Circle c3 = new Circle(3.0);
		System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea() + " and color " + c3.getColor());
	
		Circle c4 = new Circle();
		c4.setRadius(5.0);
		System.out.println("Radius is " + c4.getRadius());
		c4.setColor("Pink");
		System.out.println("Color is " + c4.getColor());
	}
}