package day8;

public class DemoThread {

	public static void main(String[] args) {
		//Thread t1 = new Thread1("New Thread");
		new Thread(()->{
			for(int i=0;i<10;i++) {
			System.out.println("thread1 "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}}
				).start();
		Thread t2 =new Thread(new Thread2("new Thread2"));
		t2.start();
		//System.out.println(t1.isAlive());
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread: "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		//System.out.println(t1.isAlive());
	}

}
