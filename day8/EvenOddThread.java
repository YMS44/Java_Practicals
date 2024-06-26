package day8;

public class EvenOddThread implements Runnable{
	
	static Thread one;
	static Thread two;
	
	@Override
	public void run() {
		for(int i=0;i<=20;i++) {
			if(i%2==0) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
			else {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		}
	}
	
}
