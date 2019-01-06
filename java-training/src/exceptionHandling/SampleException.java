package exceptionHandling;

public class SampleException {

	public static void main(String[] args) {
		/*
		try {
			int value = 100;
			int result = value / 0;

			System.out.println(result);

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Please choose another value to divide the integer");
			
			e.printStackTrace();
		}
		*/
		
		try {
			String text = null; //It will give a nullPointerException where we have none object operation			
			System.out.println(text.length());	
		} catch (Exception e) {
			System.out.println("In this situation, we haven't any object");
		}
	}
}