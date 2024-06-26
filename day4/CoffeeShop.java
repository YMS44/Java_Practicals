package day4;

import java.util.Scanner;

public class CoffeeShop {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Coffee[] coffee = Coffee.values();
			for(Coffee c:coffee) {
				System.out.println(c);
			}
			System.out.println("Enter your choice : small/medium/large ");
			String ch = sc.next();
			Coffee c  = Coffee.valueOf(ch.toUpperCase());
			switch(c) {
			case SMALL:
				System.out.println("Small");
				System.out.println(c.getPrice());
				break;
			case MEDIUM:
				System.out.println("Medium");
				System.out.println(c.getPrice());
				break;
			case LARGE:
				System.out.println("Large");
				System.out.println(c.getPrice());
				break;
				
			}
		}
	}

}
