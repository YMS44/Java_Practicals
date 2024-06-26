package day5;

import java.util.Comparator;

public class BalanceComparator implements Comparator<Account>{
	@Override
	public int compare(Account ac1,Account ac2) {
		if(ac1.balance<ac2.balance) {
			return -1;
		}
		else if(ac1.balance>ac2.balance) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
