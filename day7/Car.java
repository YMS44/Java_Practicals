package day7;

public class Car {
	
	String model;
	String color;
	double price;
	int year;
	int stock;
	


	public Car(String model, String color, double price, int year, int stock) {
		super();
		this.model = model;
		this.color = color;
		this.price = price;
		this.year = year;
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", price=" + price + ", year=" + year + ", stock=" + stock
				+ "]";
	}

	
	
	

}
