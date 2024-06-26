package day3;

public class IceCream extends DesertStore{
	protected double price;
	public IceCream(double quantity, String flavour, double price) {
		super(quantity, flavour);
		this.price = price;
	}

	public double totalAmount() {
		return (quantity*price);
	}

	@Override
	public String toString() {
		return super.toString()+" Name: IceCream totalAmount()=" + totalAmount();
	}


}
