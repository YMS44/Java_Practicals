package day7;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class DemoIntegerStream {

	public static void main(String[] args) {
		Integer [] arr = {23,4,5,98,56,23,4,10,2,3,8,9,6,5,7,5,4,56,15,36,52,6,2};
		Integer [] arr1 = {23,4,5,98,56,23,4,1,5,4,56,103,560,85,90,2};
		List<Integer> ilist = Arrays.asList(arr);
		
		Stream<Integer> istream = ilist.stream();
		
		List<Integer> mapped = istream.distinct().sorted().map((n)->n*10).collect(Collectors.toList());
		System.out.println(mapped);
		
		
		istream = ilist.stream();
		List<Integer> filtered = istream.sorted().filter((n)->n>50).collect(Collectors.toList());
		System.out.println(filtered);
		
		istream = ilist.stream();
		List<Integer> firstten = istream.limit(10).collect(Collectors.toList());
		System.out.println(firstten);
		
		istream = ilist.stream();
		System.out.println(istream.anyMatch((n)->n==90));
		
		istream = ilist.stream();
		System.out.println(istream.anyMatch((n)->n<100));
		
		istream = ilist.parallelStream();
		long total = istream.reduce(1, (n1,n2)-> n1+n2);
		System.out.println(total);
		
		istream = ilist.stream();
		Optional<Integer> min=istream.min(Integer::compareTo);
		System.out.println(min.get());
		
		istream = ilist.stream();
		Optional<Integer> max=istream.max(Integer::compareTo);
		System.out.println(max.get());
		
		istream = ilist.stream();
		OptionalDouble avg =istream.mapToDouble(Double::valueOf).average();
		System.out.println(avg.getAsDouble());
		
		System.out.println(Stream.of(Arrays.asList(arr),Arrays.asList(arr1)).flatMap(List::stream).distinct().collect(Collectors.toList()));
		
		istream = ilist.stream();
		List<Integer> a = istream.sorted().dropWhile((n)->n<23).collect(Collectors.toList());
		System.out.println(a);
	}

}
