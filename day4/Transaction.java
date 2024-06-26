package day4;

import java.util.ArrayList;
import java.util.List;

public class Transaction{
	List<Account> user;
	public Transaction(List<Account> user) {
		this.user = user;
	}
	public void addAccount(Account a) throws TransactionException{
		for(Account ac : user) {
			if(ac.getCustomer_id()==a.getCustomer_id()) {
				throw new TransactionException("User already Exists");
			}
		}
		user.add(a);
	  	
	}
	
	public void withdraw_handle(Account a, double amt) throws TransactionException{
		for(Account ac : user) {
			if (ac.getCustomer_id() == a.customer_id){
				if(ac.getBalance()<amt) {
					throw new TransactionException("Insufficient Amount");
				} else {
					ac.withdraw(amt);
				}
			}
			
		}
	}
	
	public void deposit_handle(Account a, double amt) throws TransactionException{
		for(Account ac : user) {
			if (ac.getCustomer_id() == a.customer_id){
			if(amt>50000) {
				throw new TransactionException("Deposit amount exceeds daily deposit limit(50000).");
			} else {
				ac.deposit(amt);
			}
			}
		}
	}
	
	public static void main(String[] args) { 
		List<Account> user = new ArrayList<>();
		user.add(new Account("ajay", 01, 478200));
		user.add(new Account("atul", 02, 26583));
		
		Transaction trn = new Transaction(user);
		
		try {
			trn.withdraw_handle(user.get(0), 50000.00);
			System.out.print(user.get(0).getBalance());
		}catch(TransactionException e) {
			System.out.println(e);
		}
	}
	

}
