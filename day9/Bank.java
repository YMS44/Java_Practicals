package day9;
//
//import java.util.concurrent.Executor;
//import java.util.concurrent.Executors;

public class Bank {
	public static void main(String[] args) {
	
		Account account = new Account();
		
		Thread thread  = new Thread(new Runnable() {
				@Override
				public void run() {
					account.Deposit(1000);
				}
			
		});
		Thread thread1  = new Thread(new Runnable() {
			@Override
			public void run() {
				account.Withdraw(500);
			}
		
	});
		thread.start();
		thread1.start();
	}
}
