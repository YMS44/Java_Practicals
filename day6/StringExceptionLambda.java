package day6;

public class StringExceptionLambda {
	public static boolean operationString(StringPredicate func, String s) throws EmptyStringException {
		if(s=="") {
			throw new EmptyStringException("string is empty.");
		} else {
			return func.verifyString(s);
		}
	}
	
	public static void main(String[] args) {
//		String s = "Lambdas add power to java";
		String s="";
		
		try {
			System.out.println(operationString((str)->str.equals(s), s));
		} catch (EmptyStringException e) {
			e.printStackTrace();
		}			
			
	
			
	}
}
