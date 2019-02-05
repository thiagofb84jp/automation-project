package br.com.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet tSet = new TreeSet<>();
		
		tSet.add(12);
		tSet.add(887);
		tSet.add(34);
		tSet.add(654);
		tSet.add(111);
		tSet.add(434);
		
		System.out.println(tSet);
		
		tSet.remove(111);
		System.out.println("tSet Object values : " + tSet);
		
		System.out.println("Set contains 12 ? " + tSet.contains(12));
		System.out.println("tSet Object values : " + tSet); //[12, 34, 434, 654, 887]
		
		System.out.println("First element of TreeSet : " + tSet.first()); //12
		System.out.println("Last element of TreeSet : " + tSet.last()); //887
		
		System.out.println("Use of Headset : " + tSet.headSet(111));
		System.out.println("Use of Tailset : " + tSet.tailSet((111)));

		System.out.println("tSet Object values : " + tSet);
		System.out.println("Use of Subset : " + tSet.subSet(34, 788));
		
		tSet.clear();
		System.out.println("tSet Object values : " + tSet);		
	}
}