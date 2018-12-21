package br.com.javaOOProgramming;

public class MedicalClass implements Student {

	@Override
	public void displayName() {
		System.out.println("Hi, We are from Medical Departament");
	}

	@Override
	public void getStudentNumber() {
		System.out.println("We are 140 Students");
	}

	@Override
	public void getStandard() {
		System.out.println("We are from MBBS");
	}
	
	public void getUniversity() {
		System.out.println("University name is: London University");
	}
	
	public static void main(String[] args) {
		EngineeringClass ec = new EngineeringClass();
		MedicalClass mc = new MedicalClass();
		
		ec.displayName();
		ec.getStandard();
		ec.getStudentNumber();
		ec.getUniversity();
		
		System.out.println("******************************************************");
		
		mc.displayName();
		mc.getStandard();
		mc.getStudentNumber();
		mc.getUniversity();
	}

	@Override
	public void getInterfaceName() {
		// TODO Auto-generated method stub
		
	}
}