package day8;

public class Print {	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] arr2 = {10, 20, 30, 40, 50};
		PrintArray pr = new PrintArray();
		
		Thread one = new Thread(new Runnable() {
			
			@Override
			public void run () {
				synchronized(pr) {
					pr.printArray(arr);
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
			}
		});
		
		Thread two = new Thread(new Runnable() {
			
			@Override
			public void run () {
				synchronized(pr) {
					pr.printArray(arr2);
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
			}
		});
		
		one.start();
		two.start();
		
	}
}
