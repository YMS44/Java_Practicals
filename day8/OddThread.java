package day8;

public class OddThread extends Thread {
	String name;
	public OddThread(String name) {
		this.name=name;
	}
	public void run() {
		for(int i=1;i<=20;i+=2) {
			System.out.println("Odd Thread: "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
