package day6;

public class RevStr {

	public static String str_rev(String s) {
		String s1="";
		int n = s.length();
		
		for(int i=n-1; i>=0; i--) {
			s1=s1+s.charAt(i);
		}
		return s1;
	}
}
