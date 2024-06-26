package day9;

public class Account {
	double balance = 0;
	
	
	public synchronized void Deposit(int value) {
		System.out.println("Waiting for deposit.");
		balance = balance+value;
		System.out.println("Deposit Complete.");
		System.out.println("Balance: "+balance);
		notify();
	}

	public synchronized void Withdraw(int value) {
		
		if(balance<value) {
			System.out.println("Insufficient balance");
		}
		else {
			balance=balance-value;
			System.out.println("Withdraw Complete.");
			System.out.println("Balance: "+balance);
		}
		
		notify();
	}
}
