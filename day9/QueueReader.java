package day9;


import java.util.concurrent.BlockingQueue;

public class QueueReader implements Runnable {
	BlockingQueue<String> queue;

	public QueueReader(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}
	
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=0; i<5; i++) {
			try {
				String value = queue.take();
				System.out.println("Thread "+name+" got " +value);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}
