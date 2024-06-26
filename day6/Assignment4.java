package day6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment4 {
	public static void main(String[] args) {
		List<String> lst = Arrays.asList("Red","orange","Yellow","green","Blue","indigo","Violet");
		Stream<String> sStream = lst.stream();
		
		List<String> upper = sStream.map(s->s.toUpperCase()).collect(Collectors.toList());	
		System.out.println(upper);
		
		
		sStream = lst.stream();
		List<String> lower = sStream.map(s->s.toLowerCase()).collect(Collectors.toList());	
		System.out.println(lower);
		
		
		sStream = lst.stream();
		List<String> masc = sStream.filter(s->s.toLowerCase().charAt(0)<'m').sorted().collect(Collectors.toList());	
		System.out.println(masc);
		
		sStream = lst.stream();
		List<String> mdsc = sStream.filter(s->s.toLowerCase().charAt(0)<'m').sorted(Comparator.reverseOrder()).collect(Collectors.toList());	
		System.out.println(mdsc);
		
		sStream = lst.stream();
		List<String> lst5 = sStream.filter(s->s.length() <= 5).sorted().collect(Collectors.toList());	
		System.out.println(lst5);
		
	}

}
