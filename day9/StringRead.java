package day9;

public class StringRead implements Runnable {
	StringBuffer str;

	public StringRead(StringBuffer str) {
		super();
		this.str = str;
	}
	
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=0; i<4; i++) {
			synchronized (str) {
				System.out.println("Thread "+name+" got " +str);
				str.setLength(0);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
		}
	}
}
