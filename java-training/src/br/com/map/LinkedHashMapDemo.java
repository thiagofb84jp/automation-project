package br.com.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lMap = new LinkedHashMap<>();
		
		lMap.put("Anshul", 27);
		lMap.put("John", 47);
		lMap.put("Amit", 26);
		lMap.put("Nitika", 23);
		lMap.put("Julia", 32);
		
		lMap.putIfAbsent("Anshul", 28);
		
		System.out.println(lMap);
		
		System.out.println("Size of map : " + lMap.size());
		System.out.println("Is map Empty : " + lMap.isEmpty());
		System.out.println("Is contains Nitika : " + lMap.containsKey("Nitika"));
		System.out.println("Is contains 23 : " + lMap.containsValue(23));
		System.out.println("Is contains 87 : " + lMap.containsValue(87));
	}
}