package day2;

public class Car {
	private String make;
	private String model;
	private double price;
	private int man_year;
	
	//Default constructor
	public Car() { //static is invalid for constructors
//		make = "Honda";
//		model="City";
//		price=1500000;
//		man_year=2020;
		this("Honda","City",1500000,2020);
	}

	public Car(String make, String model, double price, int man_year) {
		this.make = make;
		this.model = model;
		this.price = price;
		this.man_year = man_year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMan_year() {
		return man_year;
	}

	public void setMan_year(int man_year) {
		this.man_year = man_year;
	}
	
	public static void swap(Car[] a) {
		Car temp;
		temp =a[0];
		a[0]=a[1];
		a[1]=temp;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", price=" + price + ", man_year=" + man_year + "]";
	}
	
	
	
	

}
