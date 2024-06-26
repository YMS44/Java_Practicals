package day4;

public class Math {

	public static void main(String[] args) {
		try {
			int dividend = Integer.parseInt(args[0]);
			int divisor = Integer.parseInt(args[1]);
			
			int q = dividend / divisor;
			
			System.out.println(q);
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		catch(NumberFormatException e){
			System.out.println(e);
	
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
	
		}
		catch(Exception e){
			System.out.println(e);
	
		}
		
		
		

	}

}
