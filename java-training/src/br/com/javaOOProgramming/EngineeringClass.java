package br.com.javaOOProgramming;

public class EngineeringClass implements Student {

	@Override
	public void displayName() {
		System.out.println("Hi, We are from Engineering");
	}

	@Override
	public void getStudentNumber() {
		System.out.println("We are 120 Students");
	}

	@Override
	public void getStandard() {
		System.out.println("We are from Computer Science");
	}
	
	public void getUniversity() {
		System.out.println("University name is: " + Student.university);
	}

	@Override
	public void getInterfaceName() {
		// TODO Auto-generated method stub
		
	}
}