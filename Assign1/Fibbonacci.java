package Assign1;

import java.util.Scanner;

public class Fibbonacci {
	
	static int fibSeries(int n){
		int sum=0;
		int n1=0;
		int n2=1;
		if(n==1){
			return 1;
		}
		for(int i=1;i<=n;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number : ");
			int n = sc.nextInt();
			
			int num = fibSeries(n);
			System.out.println(num);
		}

	}

}
