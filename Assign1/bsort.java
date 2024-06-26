package Assign1;

public class bsort 
{
	public static void main(String [] args) 
	{
		int arr[]= {5,1,2,3,8};
		int length =arr.length;
		
		for(int i=0;i<length;i++)
		{
			for(int j=1;j<length-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp= arr[j];
					arr[j]= arr[j-1];
					arr[j-1]=temp;
				}
			}
			
		}
		System.out.println("sorted array:");
		for(int i=0;i<length;i++)
			System.out.println(arr[i]+" ");
	}

}
