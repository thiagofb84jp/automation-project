package exceptionHandling;

public class NestedTryCatch {
	
	public static void main(String[] args) {
		try {
			System.out.println("First Try Block");
			String text = null;
			System.out.println(text.length());
			
			try {
				System.out.println("Second Try Block");
				int value = 100/0;
				System.out.println(value);
				try {
					System.out.println("Third Try Block");
					int[] array = new int[3];
					array[5] = 100;
				} catch (Exception e) {
					System.out.println("End of Third Try Block");
					e.printStackTrace();
				}
			} catch (Exception e) {
				System.out.println("End of Second Try Block");
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println("End of First Try Block");
		}
	}
}