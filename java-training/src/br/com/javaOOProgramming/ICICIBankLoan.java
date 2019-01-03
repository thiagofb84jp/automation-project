package br.com.javaOOProgramming;

public class ICICIBankLoan extends BankLoan{
	
	public static void main(String[] args) {
		BankLoan loan = new BankLoan();
		
		loan.setAge(200);
		loan.setName("John Smith");
		loan.setAmount(100000000);
		
		System.out.println("**************************");
		System.out.println("Name is: " + loan.getName());
		System.out.println("Age is: " + loan.getAge());
		System.out.println("Amount is: " + loan.getAmount());
		System.out.println("**************************");
	}
}