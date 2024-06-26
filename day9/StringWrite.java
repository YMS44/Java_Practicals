package day9;

public class StringWrite implements Runnable {
	StringBuffer str;

	public StringWrite(StringBuffer str) {
		super();
		this.str = str;
	}
	
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=0; i<4; i++) {
			synchronized (str) {
				str.append("Hello ");
				System.out.println("Thread: "+name+" added Element "+ str);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
}
