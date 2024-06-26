package day3;

public abstract class DesertStore {
	protected double quantity;
	protected String flavour;
	
	public DesertStore(double quantity,String flavour) {
		this.quantity = quantity;
		this.flavour = flavour;
	}
	
	public abstract double totalAmount();

	@Override
	public String toString() {
		return "DesertStore quantity=" + quantity + ", flavour=" + flavour;
	}
	
	
	

}
