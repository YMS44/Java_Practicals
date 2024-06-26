package day8;

public class AnnoThread {
	public static void main(String[] args) {
	new Thread(()->{
		for(int i=0;i<10;i++) {
		System.out.println("thread "+i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}}
			).start();
	
	Runnable tt = ()->{
		for(int i=0;i<10;i++) {
			System.out.println("thread1 "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	};
	Thread t1 = new Thread(tt);
	t1.start();

}
}