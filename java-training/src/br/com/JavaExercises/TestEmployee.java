package br.com.JavaExercises;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Mary", "Smith", 1000);
		System.out.println("***************** Employee Data *****************");
		System.out.println("First Name: " + e1.getFirstName());
		System.out.println("Last Name: " + e1.getLastName());
		System.out.println("First Name, Last Name: " + e1.getName());
		System.out.println("Salary: " + e1.getSalary());
		System.out.println("Annual Salary = " + e1.getAnnualSalary());
		System.out.println("Increasing Salary = " + e1.raiseSalary(0.05f));
		System.out.println(e1.toString());
		System.out.println("**************************************************");
	}
}