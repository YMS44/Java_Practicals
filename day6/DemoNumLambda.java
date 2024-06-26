package day6;

public class DemoNumLambda {
	
	
	public static boolean verifyNumber(NumberFunc func,int n) {
		return func.checkNumber(n);
	}

	public static boolean checkPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
	}

	public static String operateOnString(StringFunc func,String s) {
		return func.caps(s);
	}
	
	public static String reverseStr(String s) {
		String s1="";
		int n = s.length();
		
		for(int i=n-1; i>=0; i--) {
			s1=s1+s.charAt(i);
		}
		return s1;
	}
	public static void main(String[] args) {
		NumberFunc ispositive = (n) -> n>=0;
		System.out.println(ispositive.checkNumber(11));
		
		
		
		NumberFunc isprime = (n) -> {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
				
			}
			return true;
		};
		System.out.println(isprime.checkNumber(13));
		
		System.out.println("************************* UPPER CASE****************************");
		StringFunc str1 = (s) -> s.toUpperCase();
		System.out.println(str1.caps("abchd"));
		
		System.out.println("************************* reverse string ****************************");
		
		StringFunc reverse_str = (s) -> {
			String s1="";
			int n = s.length();
			
			for(int i=n-1; i>=0; i--) {
				s1=s1+s.charAt(i);
			}
			return s1;
		};
		System.out.println(reverse_str.caps("abcd"));
		
		System.out.println(verifyNumber((n)->n%2==0,10));
		System.out.println("************************* prime1 ****************************");
		System.out.println(verifyNumber((n)->{
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
				
			}
			return true;
		},11));
		System.out.println("************************* prime2 ****************************");
		System.out.println(verifyNumber(Math::isPrime,19));
		
		System.out.println("************************* lower case ****************************");
		System.out.println(operateOnString((s)->s.toLowerCase(),"GHSSSahaah"));
		
		
		System.out.println(operateOnString((s)->{
			String s1="";
			int n = s.length();
			
			for(int i=n-1; i>=0; i--) {
				s1=s1+s.charAt(i);
			}
			return s1;
		},"HASJAS"));
		
		System.out.println("*************************  ****************************");
		System.out.println(operateOnString(RevStr::str_rev,"sbcgdh"));

	}
	
	

}
