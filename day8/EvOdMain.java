package day8;

public class EvOdMain {

	public static void main(String[] args) {
		
		
		
		EvenOddThread evod = new EvenOddThread();
		
		Thread t1 = new Thread(evod,"Even");
		Thread t2 = new Thread(evod,"Odd");
		t1.start();
		t2.start();
		
		

	}

}
