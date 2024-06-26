package day3;

public class EmployeePortal {

	public void showGross(Employee e) {
		System.out.println("Gross Salary: " + e.calculateGross());
	}
	
	public void showNet(SalariedEmployee e) {
		System.out.println("Net Salary: "+e.calculateNet());
	}
	
	public static void main(String[] args) {
	
		EmployeePortal portal = new EmployeePortal();
//		SalariedEmployee esal = new SalariedEmployee(556,"Kunal",50300);
//		System.out.println(esal);
//	    portal.showGross(esal);  //Up casting
//	    portal.showNet(esal);
		
//		Manager mg = new Manager(2,"Manasi",62000);
//		SalesManager sm = new SalesManager(2,"ABC",35000,2000);
//		System.out.println(mg);		
//		System.out.println(sm.toString());
//		sm.displayIncentive();
		
		Employee [] emps = new Employee[3];
		
		emps[0] = new SalesManager(22,"sss",100000,10000);
		emps[1] = new SalariedEmployee(66,"sss",45530);
		emps[2] = new Manager(88,"mmm",78964);
		
		for(Employee e : emps) {
			portal.showGross(e);
			if(e instanceof SalariedEmployee) {
				SalariedEmployee ss = (SalariedEmployee) e; // Down casting
				if(ss instanceof SalesManager) {
					SalesManager sm = (SalesManager) ss; //Down Casting
					sm.displayIncentive();
				}
				portal.showNet(ss);
			}
			
		}
		
		
		

		
	}

}
