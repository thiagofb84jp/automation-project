package br.com.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet<>();
		
		set.add("123");
		set.add("Anshul");
		set.add("Java Course");
		set.add("LinkedHashSet");
		set.add("66783");
		
		System.out.println(set);
	}
}