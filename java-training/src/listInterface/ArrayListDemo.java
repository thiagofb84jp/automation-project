package listInterface;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList<Integer>(); //Generic ArrayList
		list.add(12);
		list.add(42);
		list.add(62);
		list.add(12);
		list.add(78674);
		
		System.out.println(list); //Prints all elements ArrayList
		
		list.remove(1);
		System.out.println(list); //Prints all elements ArrayList
		
		System.out.println(list.get(3)); //Prints the third element of ArrayList
	}
}