package br.com.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashDemoSet {
	
	public static void main(String[] args) {
		HashSet hash = new HashSet<>();
		hash.add("Anshul");
		hash.add("Thakur");
		hash.add("Kronos");
		hash.add("New Delhi");
		hash.add("India");
		System.out.println(hash);
		
		hash.remove("India");
		System.out.println(hash);
		
		System.out.println("Is set contain Anshul " + hash.contains("Anshul")); //It shows true or false
		
		Iterator i = hash.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		hash.clear();
	}
}