package day4;

import day3.SalariedEmployee;
import day3.TaxPayer;
import day3.Manager;
import day3.SalesManager;
import day3.Consultant; 

public class Payroll {
	
	public void processTax(TaxPayer payer) {
		System.out.println("Tax Payable: "+payer.calculateTax());
	}

	public static void main(String[] args) {
		Payroll payroll = new Payroll();
		
		TaxPayer[] tx = new TaxPayer[4];
		
		tx[0] = new SalariedEmployee(1,"abs",78900);
		tx[1] = new Manager(1,"abs",12030);
		tx[2] = new SalesManager(1,"abs",10230,2000);
		tx[3] = new Consultant("abs",130256);
		
		for(TaxPayer payer: tx) {
			payroll.processTax(payer);
		}

	}

}
