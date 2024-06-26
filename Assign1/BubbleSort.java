package Assign1;

public class BubbleSort {

	static void bubbleSort(int[] arr) {
		
		int temp=0;
		int n = arr.length;
		System.out.println("The array after sorting");
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				if(arr[j-1]>arr[j]) {
					  temp = arr[j-1];  
                      arr[j-1] = arr[j];  
                      arr[j] = temp;  
					
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,100,30,10,40,50,90,60,70,80};
		
		System.out.println("The array before sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		bubbleSort(arr);
		

	}

}
