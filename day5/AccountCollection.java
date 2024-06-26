package day5;

import java.util.*;

public class AccountCollection {
	
	public static Map<Integer, String> getSameBranchUser(List<Account> lst){
		Map<Integer, String> skillmap = new HashMap<>();
		for(Account ac : lst) {
			if(ac.ifsc.contains("BANKSBI")){
				skillmap.put(ac.id, ac.ifsc);
			}
		}
		return skillmap;
	}
	
	public static List<Account> filterBranch(List<Account> lst) {
		List<Account> lst1 = new ArrayList<>();
		for(Account ac:lst) {
			if(ac.getIfsc()=="BANKSBI") {
				lst1.add(ac);
			}
		}
		return lst1;
		
	}
	
	public static List<Account> filterBalance(List<Account> lst) {
		List<Account> lst2 = new ArrayList<>();
		for(Account ac:lst) {
			if(ac.getBalance()>=40000) {
				lst2.add(ac);
			}
		}
		return lst2;
		
	}

	public static void main(String[] args) {
		List<Account> lst = new ArrayList<>();
		List<Account> lst1 = new ArrayList<>();
		List<Account> lst2 = new ArrayList<>();
		
		lst.add(new Account(13,"Kunal",56123,"BANKSBI"));
		lst.add(new Account(02,"Yogesh",89123,"BANKHDFC"));
		lst.add(new Account(35,"Pranav",45623,"BANKSBI"));
		lst.add(new Account(14,"Manasi",21123,"BANKHDFC"));
		
		for(Account ac:lst) {
			System.out.println(ac);
		}
		Collections.sort(lst);
		System.out.println("********************Sort By Id**********************");
		
		for(Account ac:lst) {
			System.out.println(ac);
		}
		
		
		Collections.sort(lst,new SortName());
		System.out.println("********************Sort By Name**********************");
		
		for(Account ac:lst) {
			System.out.println(ac);
		}
		

		
		Collections.sort(lst,new BalanceComparator());
		System.out.println("********************Sort By Balance**********************");
		for(Account ac:lst){
			System.out.println(ac);
		}
		
		System.out.println("********************Binary Search**********************");
		int found = Collections.binarySearch(lst,new Account(35,null,0,null));
		System.out.println("The index of element: "+found);
		
		System.out.println("********************Filter IFSC**********************");
		lst1 = filterBranch(lst);
		for(Account ac:lst1){
			System.out.println(ac);
		}
		
		System.out.println("********************Filter Balance**********************");
		lst2 = filterBalance(lst);
		for(Account ac:lst2){
			System.out.println(ac);
		}
		
		
		System.out.println("******************** Mapping **********************");
		Map<Integer,String> skillsmap = getSameBranchUser(lst);
		System.out.println(skillsmap);
		

	}

}
