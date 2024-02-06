package com.tcs.collections;

import java.util.ArrayList;
import java.util.List;

public class PerformTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Investor i1=new Investor(1,"abc","madurai","shares",50001);
		Investor i2=new Investor(2,"cba","chennai","bonds",50000);
		Investor i3=new Investor(3,"bca","namakkal","deposits",10000);
		Investor i4=new Investor(4,"cbadd","theni","shares",30000);
		Investor i5=new Investor(5,"klacba","sivaganga","bonds",102090);
		
		ArrayList<Investor> list = new ArrayList<>();
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		list.add(i5);
		
		Transaction t1=null;
		if(InvestorRepo.findById(list,100))
			t1=new Transaction(101,"01-Jan-2024",6000,100);
		Transaction t2=new Transaction(102,"10-Feb-2023",100001,2);
		Transaction t3=new Transaction(103,"01-Dec-2023",80923,3);
		Transaction t4=new Transaction(104,"09-Nov-2023",78500,4);
		Transaction t5=new Transaction(105,"10-Oct-2023",345600,5);
		
		InvestmentTransactions it1=new InvestmentTransactions();
		it1.addTransactin(t1);
		it1.addTransactin(t2);
		it1.addTransactin(t3);
		it1.addTransactin(t4);
		it1.addTransactin(t5);
		
		//it1.showTransactions();
		System.out.println(it1.showGivenTransaction(104));
		boolean b=it1.updateTransaction(104, 75000, 3);
		System.out.println(it1.showGivenTransaction(104));
		
	}

}
