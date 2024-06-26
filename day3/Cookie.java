package day3;

public class Cookie extends DesertStore {
	protected double price;
	public Cookie(double quantity, String flavour, double price) {
		super(quantity, flavour);
		this.price = price;
	}

	public double totalAmount() {
		return (price*(quantity/12));
	}

	@Override
	public String toString() {
		return super.toString()+" Name: Cookie totalAmount()=" + totalAmount();
	}

}
