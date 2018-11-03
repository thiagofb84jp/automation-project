package rectangle;

public class RectangleTest {
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println(r1.toString());
		
		r1.setLength(5);
		r1.setWidth(10);
		System.out.println(r1.toString());
		System.out.println("Area=" + r1.getArea() + " and Perimeter=" + r1.getPerimeter());
		
		Rectangle r2 = new Rectangle(7.5f, 5.3f);
		System.out.println(r2.toString());
		System.out.printf("Area=%.2f and ", r2.getArea());
		System.out.printf("Perimeter=%.2f", r2.getPerimeter());
	}
}