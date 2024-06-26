package day3;


public class Manager extends SalariedEmployee {
	
	protected static int ta=1500;
	
	public Manager(int empid, String name, double basic) {
		super(empid, name, basic);
		
	}
	
	@Override
	public double calculateGross() {
		return super.calculateGross()+ta;
	}
	
	@Override
	public double calculateNet() {
		double tax = calculateTax() ;
		return calculateGross()-tax;
	}
	
	@Override
	public double calculateTax(){
		return calculateGross()*0.2;
	}

	

}
