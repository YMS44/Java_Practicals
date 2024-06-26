package day8;

public class CreateTable {
	public static void main(String[] args) {
		Thread table = new Table1(5,6);
		Thread t1= new Thread(table,"Increment");
		Thread t2= new Thread(table,"Table");
		t1.start();
		t2.start();
		
	}
}
