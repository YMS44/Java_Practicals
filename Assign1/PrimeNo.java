package Assign1;
import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number : ");
			int n = sc.nextInt();
			if ((n!=0) && (n!=1)){
				for(int i=2;i<(n/2);){
					if ((n%i)==0){
						System.out.println(n+" is not a prime number");
						break;
					}
					else {
						System.out.println(n+" is a prime number");
						break;
					}
					
				}
			}
		}

	}

}
