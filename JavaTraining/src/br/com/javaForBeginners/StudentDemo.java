package br.com.javaForBeginners;

public class StudentDemo {
	
	private int rollNumber;
	private String name;
	private String standard;
	
	public StudentDemo(int rollNumber, String name, String standard) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.standard = standard;
	}
	
	public void display() {
		System.out.println("Student roll number: " + rollNumber + " name is: " + name + " and in class: " + standard);
	}
	
	public static void main(String[] args) {
		StudentDemo std1 = new StudentDemo(10, "Frank Smith", "2nd");
		StudentDemo std2 = new StudentDemo(20, "Michael Moore", "5th");
		
		std1.display();
		std2.display();
	}
}