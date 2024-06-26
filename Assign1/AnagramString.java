package Assign1;
import java.util.Scanner;
import java.lang.String;
public class AnagramString {

	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter String 1: ");
			String str1 = sc.next();
			System.out.print("Enter String 2: ");
			String str2 = sc.next();
			String st1 = str1.toLowerCase();
			String st2 = str2.toLowerCase();
			if(st1.length()==st2.length()) {
				for(char c:st1.toCharArray()) {
					int i = st2.indexOf(c); 
					if (i==-1) {
						System.out.println("The given strings are not anagrams");
						break;
					}
					else {
						System.out.println("The given strings are anagrams");
					}
				}
				
				
			}
		}

	}

}
