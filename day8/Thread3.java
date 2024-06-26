package day8;

public class Thread3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<10; i++) {
			if(i==5)
				Thread.yield();
			else
				System.out.println(Thread.currentThread().getName() + ": ");
		}
	}
	
}
