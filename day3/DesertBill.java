package day3;
import java.util.Scanner;

public class DesertBill {
//	public double calculateBill(DesertStore d) {
//		return d.totalAmount();
//	}

	public static void main(String[] args) {
		Cart cart = new Cart();
		try (Scanner sc = new Scanner(System.in)) {
			double qty;
			String flavour;
			double price;
			int ch=0;
			DesertStore ds;
			while(ch!=4) {
				System.out.println("1.Candy\n2.Cookie\n3.Icecream\n4.Exit");
				System.out.print("Enter your choice: ");
				ch = sc.nextInt();
				
				switch(ch) {
				case 1:
					System.out.println("Enter your quantity: ");
					qty = sc.nextDouble();
					System.out.println("Enter your flavour: ");
					flavour = sc.next();
					System.out.println("Enter your price: ");
					price = sc.nextDouble();
					ds = new Candy(qty,flavour,price);
					cart.addToCart(ds);
					break;
				case 2:
					System.out.println("Enter your quantity: ");
					qty = sc.nextDouble();
					System.out.println("Enter your flavour: ");
					flavour = sc.next();
					System.out.println("Enter your price: ");
					price = sc.nextDouble();
					ds = new Cookie(qty,flavour,price);
					cart.addToCart(ds);
					break;
				case 3:
					System.out.println("Enter your quantity: ");
					qty = sc.nextDouble();
					System.out.println("Enter your flavour: ");
					flavour = sc.next();
					System.out.println("Enter your price: ");
					price = sc.nextDouble();
					ds = new IceCream(qty,flavour,price);
					cart.addToCart(ds);
					break;
				case 4:
					cart.showBill();
					System.out.println("Thank you for visiting!");
					cart.resetBill();
					break;
				default:
					System.out.println("Wrong Choice");
				}
			}
		}
	}

}
