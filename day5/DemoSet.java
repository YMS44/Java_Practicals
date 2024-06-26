package day5;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		
		System.out.println(set);
		
		set.remove("Two");
		
		System.out.println(set);
		
		set.add("Four");
		
		for(String s: set) {
			System.out.println(s);
		}
		
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
