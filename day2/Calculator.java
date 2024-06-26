package day2;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = Math.add(34, 45);
		System.out.println(res);
		System.out.println(Math.add(30.5f, 10));
		res = Math.addition(1,2,3,4,5,6,7,8,10);
		System.out.println(res);
		
		int n[] = {12,15};
		Math.swap(n);
		System.out.println(""+n[0]+"  "+n[1]);
		
	}

	
	
}
