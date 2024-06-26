package day4;

import java.util.HashSet;
import java.util.Set;

public final class Car {
	private final String make;
	private final String model;
	private final double price;
	private final Set<String> colours;
	
	public Car(String make, String model, double price, Set<String> colours) {
		this.make = make;
		this.model = model;
		this.price = price;
		this.colours = colours;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public Set<String> getColours() {
		return new HashSet<>(colours);
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", price=" + price + ", colours=" + colours + "]";
	}
	
	public static void main(String[] args) {
		Set<String> colours = new HashSet<>();
		colours.add("black");
		colours.add("Red");
//		Car car = new Car("Mahindra","Thar",1200000,colours);
		
		Car car1 = new Car("TATA","Nexon",2000000,colours);
		
		car1.getColours().add("green");
//		System.out.println(car);
		System.out.println(car1);
	}

}
