package br.com.map;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		
		hMap.put("Anshul", 27);
		hMap.put("John", 47);
		hMap.put("Amit", 26);
		hMap.put("Nitika", 23);
		hMap.put("Julia", 32);
		
		System.out.println(hMap);
		
		if (hMap.containsKey("Amit")) {
			System.out.println("Age of Amit is : " + hMap.get("Amit")); // Method that get the key value
		}
		
		System.out.println("Size of hashmap is : " + hMap.size());
		hMap.clear(); // Clean all the elements
		System.out.println("Is hashMap Empty ? " + hMap.isEmpty());
	}
}