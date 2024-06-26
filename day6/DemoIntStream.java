package day6;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
//import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStream {
	
	public static void main(String[] args) {
		int [] arr = {23,4,5,98,56,23,4,1,2,3,8,9,6,5,7,5,4,56,15,36,52,6,2};
		IntStream istream = Arrays.stream(arr);
		
		long distinctele = istream.distinct().count();
		System.out.println(distinctele);
		
		istream = Arrays.stream(arr);
		long allele = istream.count();
		System.out.println(allele);
		
		istream = Arrays.stream(arr);
		istream.distinct().sorted().forEach((n)->System.out.println(n));
		
		istream = Arrays.stream(arr);
		List<Integer> squares = istream.distinct().map((n)->n*n).boxed().collect(Collectors.toList());	
		System.out.println(squares);
		
		istream = Arrays.stream(arr);
		List<Integer> even = istream.distinct().filter((n)->n%2==0).boxed().collect(Collectors.toList());	
//		Predicate even1 = (n)->n%2==0;
		System.out.println(even);
		
		istream = Arrays.stream(arr);
		int total = istream.reduce(1, (n1,n2)->n1+n2);
		System.out.println(total);
		
		istream = Arrays.stream(arr);
		OptionalInt min = istream.min();
		if(min.isPresent()) {
			System.out.println(min.getAsInt());
		}
		
		
		istream = Arrays.stream(arr);
		OptionalInt max = istream.max();
		if(max.isPresent()) {
			System.out.println(max.getAsInt());
		}
		
		istream = Arrays.stream(arr);
		OptionalDouble avg = istream.average();
		if(avg.isPresent()) {
			System.out.println(avg.getAsDouble());
		}
		
	} 

}
