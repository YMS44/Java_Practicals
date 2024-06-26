package day3;

public class Consultant implements TaxPayer{
	protected String name;
	protected double invoiceAmt;
	
	public Consultant(String name, double invoiceAmt) {
		this.name = name;
		this.invoiceAmt = invoiceAmt;
	}
	
	public double calculateNet() {
		double tax = calculateTax();
		return invoiceAmt - tax;
	}
	
	@Override
	public double calculateTax(){
		return invoiceAmt*0.1;
	}
	
}
