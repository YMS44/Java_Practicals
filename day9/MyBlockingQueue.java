package day9;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class MyBlockingQueue {
	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);
		Executor service = Executors.newFixedThreadPool(4);
		for (int i=0; i<10;i++) {
			service.execute(new QueueWriter(queue));
			service.execute(new QueueReader(queue));
		}
		
	}
}
