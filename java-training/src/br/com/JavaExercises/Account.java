package br.com.JavaExercises;

public class Account {

	private String id;
	private String name;
	private int balance;

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
		return amount = amount + balance;
	}

	public int debit(int amount) {
		if (amount <= balance) {
			amount = amount - balance;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}

	public int transferTo(Account another, int amount) {
		if(amount <= balance) {
			//another = amount;
		}else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	
	public String toString() {
		return "Account[" + id + "," + name + "," + balance + "]";
	}
}