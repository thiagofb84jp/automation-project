package br.com.JavaExercises;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private float salary;
	
	public Employee(int id, String firstName, String lastName, float salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getName() {
		return firstName + ", " + lastName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public float getAnnualSalary() {
		return salary + 12;
	}
	
	public float raiseSalary(float percent) {
		float newSalary = percent * salary;
		return newSalary + salary;
	}
	
	public String toString() {
		return "Employee Data[" + id + ", " + getName() + ", " + salary + "]";
	}
}