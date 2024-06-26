package day3;

public class Candy extends DesertStore{
	protected double price;

	public Candy(double quantity, String flavour, double price) {
		super(quantity, flavour);	
		this.price=price;
	}
	
	@Override
	public double totalAmount() {
		return (price*(quantity/1000));
	}

	@Override
	public String toString() {
		return super.toString()+" Name: Candy Total Amount="+totalAmount();
	}
	
}
