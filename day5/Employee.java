package day5;


import java.util.Set;

public  class Employee implements Comparable<Employee>{
	int empd;
	String name;
	double salary;
	Set<String> skills;
	public int getEmpd() {
		return empd;
	}
	public void setEmpd(int empd) {
		this.empd = empd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	public Employee(int empd, String name, double salary, Set<String> skills) {
		super();
		this.empd = empd;
		this.name = name;
		this.salary = salary;
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Employee [empd=" + empd + ", name=" + name + ", salary=" + salary + ", skills=" + skills + "]";
	}
	
	@Override
	public int compareTo(Employee o) {
//		if(this.empd<o.empd) {
//			return -1;
//		}
//		else if(this.empd>o.empd) {
//			return 1;
//		}
//		else {
//			return 0;
//		}
		return this.empd-o.empd;
		
		
	}

		
		
	
	
	
	

}
