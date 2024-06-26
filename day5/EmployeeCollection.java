package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeCollection {
	
	public static Map<String, Set<String>> getSkilledEmployees(List<Employee> emplist){
		Map<String, Set<String>> skillmap = new HashMap<>();
		for(Employee e : emplist) {
			if(e.skills.contains("java")){
				skillmap.put(e.name, e.skills);
			}
		}
		return skillmap;
	}
	

	public static void main(String[] args) {
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
		lst.add(new Employee(555,"zaa",50000,skills));
		lst.add(new Employee(222,"add",80000,skills2));
		lst.add(new Employee(888,"asa",56000,skills3));
		

		
		for(Employee e:lst) {
			System.out.println(e);
		}
		Collections.sort(lst);
		System.out.println("********************Sort By Id**********************");
		
		for(Employee e:lst) {
			System.out.println(e);
		}
		
		int found = Collections.binarySearch(lst,new Employee(555,null,0,null));
		System.out.println(found);
		
		Collections.sort(lst,new NameComparator());
		System.out.println("********************Sort By Name**********************");
		
		for(Employee e:lst) {
			System.out.println(e);
		}
		
		Map<String,Set<String>> skillsmap = getSkilledEmployees(lst);
		System.out.println(skillsmap);
		
		Collections.sort(lst,new SalaryComparator());
		System.out.println("********************Sort By Salary**********************");
		
		for(Employee e:lst) {
			System.out.println(e);
	}
	}

}
