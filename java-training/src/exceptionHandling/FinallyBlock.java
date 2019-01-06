package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			String text = "Anshul";
			System.out.println(text);
			
			String textNull = null;
			System.out.println(textNull.length());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Hi, I am inside finally block");
		}
	}
}