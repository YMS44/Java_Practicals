package day5;

import java.util.Comparator;

public class SortName implements Comparator<Account>{
	@Override
	public int compare(Account ac1,Account ac2) {
		return ac1.name.compareTo(ac2.name);
	}

}
