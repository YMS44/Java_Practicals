package day3;

public class Cart {

	double totalBill=0;
	int count =0;
	public void addToCart(DesertStore ds){
	    totalBill = totalBill + ds.totalAmount();
		count ++;
	}
	public void showBill() {
		System.out.println("Number of items purchased= "+count+"\nTotal Bill= "+totalBill);
	}
	public void resetBill() {
		totalBill=0;
		count=0;
	}

}
