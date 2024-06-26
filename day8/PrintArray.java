package day8;

public class PrintArray {
	
	public void printArray(int[] arr) {
		System.out.print(Thread.currentThread().getName()+": ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
