package br.com.string;

public class StringBufferIntro {

	public static void main(String[] args) {
		String name = "Anshul";
		name.concat(" Chauan");
		
		//System.out.println("Printing name: " + name);
		
		StringBuffer name1 = new StringBuffer("Anshul");
		//name1.append(" Bashi");
		
		//name1.insert(4, "Chauan");
		
		//name1.replace(1, 3, " chauhan");
		
		//name1.delete(4, 7);
		
		name1.reverse();
		System.out.println("Printing name: " + name1);
	}
}