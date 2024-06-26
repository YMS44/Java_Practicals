package day4;

public class Account {
	String name;
	int customer_id;
	double balance;
	
	public Account(String name, int customer_id, double balance) {
		this.name = name;
		this.customer_id = customer_id;
		this.balance = balance;
	}
	
	public void withdraw(double amt) {
		this.balance = this.balance - amt;
	}
	
	public void deposit(double amt) {
		this.balance = this.balance + amt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
