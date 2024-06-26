package day5;

public class Account implements Comparable<Account>{
	int id;
	String name;
	double balance;
	String ifsc;
	public Account(int id, String name, double balance, String ifsc) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.ifsc = ifsc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", ifsc=" + ifsc + "]";
	}
	
	
	@Override
	public int compareTo(Account ac) {
		return this.id-ac.id;
	}
	
	

}
