package day7;



import java.util.ArrayList;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStream{
	
	public static Map<String, Set<String>> getSkilledEmployees(List<Employee> emplist){
		Map<String, Set<String>> skillmap = new HashMap<>();
		for(Employee e : emplist) {
			if(e.skills.contains("java")){
				skillmap.put(e.name, e.skills);
			}
		}
		return skillmap;
	}
	public static List<Employee> getEmployees(){ 
		Set<String> skills = new TreeSet<String>();
		skills.add("java");
		skills.add("javascript");
		Set<String> skills2 = new TreeSet<String>();
		skills2.add("java");
		skills2.add("python");
		Set<String> skills3 = new TreeSet<String>();
		skills3.add("c++");
		skills3.add("javascript");
		List<Employee> lst = new ArrayList<>();
		lst.add(new Employee(555,"zaa",50000,"IT",skills));
		lst.add(new Employee(222,"add",80000,"IT",skills2));
		lst.add(new Employee(888,"asa",56000,"Sales",skills3));
		
		return lst;
	}
	

	public static void main(String[] args) {
		List<Employee> lst = getEmployees();
		Stream<Employee> estream = lst.stream();
		estream.forEach(System.out::println);
		
		System.out.println("***************** Sorting by Id ************************");

		estream = lst.stream();
		estream.sorted().forEach(System.out::println);
		
		System.out.println("***************** Sorting by Name ************************");
		estream = lst.stream();
		Comparator <Employee> byname =  Comparator.comparing(Employee::getName);
		estream.sorted(byname).forEach(System.out::println);

		System.out.println("***************** Sorting by Name Dept wise ************************");
		estream = lst.stream();
		Comparator <Employee> bydeptname =  Comparator.comparing(Employee::getDepartment);
		estream.sorted(bydeptname).forEach(System.out::println);
		
		System.out.println("***************** Dept wise employee list ************************");
		Function<Employee, Department> depts = (emp) -> new Department(emp.getName(), emp.getDepartment());
		estream = lst.stream();
		estream.map(depts).forEach(System.out::println);
		
		System.out.println("***************** employee list with salary>50000 ************************");
		Predicate<Employee> salrange = (emp) -> emp.getSalary()>50000;
		estream = lst.stream();
		estream.filter(salrange).forEach(System.out::println);
		
		System.out.println("***************** employee list with skills = Java ************************");
		estream = lst.stream();
		Predicate<Employee> skills = (emp) -> emp.getSkills().contains("java");
		estream.filter(skills).forEach(System.out::println);
		
		System.out.println("***************** min/max/avg/total sal ************************");
		estream = lst.stream();
		OptionalDouble min = estream.mapToDouble(Employee::getSalary).min();
		if(min.isPresent()) {
			System.out.println("Max Salary: " +min.getAsDouble());
		}
		
		estream = lst.stream();
		OptionalDouble avg = estream.mapToDouble(Employee::getSalary).average();
		if(avg.isPresent()) {
			System.out.println("Avg Salary: " +avg.getAsDouble());
		}
		
		estream = lst.stream();
		double total = estream.mapToDouble(Employee::getSalary).sum();
		System.out.println("Total Salary: "+ total);
		
		estream = lst.stream();
		Map<String, List<Employee>> deptemps = estream.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(deptemps);
	}

}

