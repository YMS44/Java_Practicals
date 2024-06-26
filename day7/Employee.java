package day7;

import java.util.Set;

public class Employee implements Comparable<Employee>{
		int empd;
		String name;
		double salary;
		Set<String> skills;
		String department;
		
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
		
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public Employee(int empd, String name, double salary,String department, Set<String> skills) {
			this.empd = empd;
			this.name = name;
			this.salary = salary;
			this.department=department;
			this.skills = skills;
		}
		
		
		@Override
		public String toString() {
			return "Employee [empd=" + empd + ", name=" + name + ", salary=" + salary + ", skills=" + skills
					+ ", department=" + department + "]";
		}
		@Override
		public int compareTo(Employee o) {
			return this.empd-o.empd;
			
			
		}


}
