package day7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarStream {
	
	public static List<Car> getCars(){
		List<Car> car_list = new ArrayList<>();
		car_list.add(new Car("Honda", "red", 450000, 2023,20));
		car_list.add(new Car("Bugatti", "blue", 340000, 2021,30));
		car_list.add(new Car("Swift", "black", 670000, 2022,45));
		car_list.add(new Car("Hyundai", "white", 760000, 2019,12));
		car_list.add(new Car("Tata", "yellow", 120000, 2018,20));
		car_list.add(new Car("Mahindra", "red", 450000, 2015,13));
		return car_list;
	}
	
	public static void main(String[] args) {
		List<Car> car_list = new ArrayList<>();
		car_list = getCars();
		Stream<Car> carstream = car_list.stream();
//		carstream.forEach(System.out::println);
		
		System.out.println("***************** Stock for specified model and color ************************");
		Predicate<Car> carl = stk ->stk.getModel().equals("Honda") && stk.getColor().equals("red");
		carstream = car_list.stream();
		//carstream.filter(carl).mapToInt(Car::getStock).forEach(System.out::println);
		carstream.filter(carl).forEach(System.out::println);

		
		System.out.println("***************** Group by model ************************");
		carstream = car_list.stream();
		Map<String,List<Car>> grpmodel = carstream.collect(Collectors.groupingBy(Car::getModel));
		System.out.println(grpmodel);
		
		System.out.println("***************** Count by model ************************");
		carstream = car_list.stream();
		Map<String,Long> cntmodel = carstream.collect(Collectors.groupingBy(Car::getModel,Collectors.counting()));
		System.out.println(cntmodel);
		
		System.out.println("***************** Sort by price ************************");
		carstream = car_list.stream();
		Comparator<Car>  sortp = Comparator.comparing(Car::getPrice);
		carstream.sorted(sortp).forEach(System.out::println);
		
		System.out.println("***************** Sort by Maf year ************************");
		carstream = car_list.stream();
		Comparator<Car>  sorty = Comparator.comparing(Car::getYear);
		carstream.sorted(sorty).forEach(System.out::println);
	}
			
}
