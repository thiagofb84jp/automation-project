package br.com.javaForBeginners;

public class SecondJavaClass {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Team";

		int a = 200;
		int b = 300;

		/*
		System.out.println(str1 + " " + str2);
		System.out.println(a + b);
		
		System.out.println(a + b + str1 + str2); //All the variables will be concatenated and values will be sum
		System.out.println(str1 + str2 + a + b); //All the variables will be concatenated and the values aren't sum
		*/
		
		/*
		if(a > 1000) {
			System.out.println("A is less than 1000");
		}else {
			System.out.println("A is greater than 1000");
		}
		*/
		
		/*
		if(a == 100) {
			System.out.println("A is 100");
		}else if(a == 200) {
			System.out.println("A is 200");
		}else if(a == 300){
			System.out.println("A is 300");
		}else {
			System.out.println("Value doesn't present");
		}
		*/
		
		int day = 6;
		
		switch (day) {
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wednesday");
			break;
		case 4:
			System.out.println("Today is Thrusday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		default:
			System.out.println("Heeeyyyy!! It's weekend!");
			break;
		}
	}
}