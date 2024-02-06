package com.tcs.oops.encapsulation.statictest;

public class CreateInvestors {
	public static void main(String[] args) {
		Investor inv = new Investor();
		System.out.println(inv.getCount());
		
		
		inv=new Investor(100, "Karuppu Raja N", "Madurai",100000);
		inv.setCount(10);
		System.out.println(inv);
		
		Investor inv1=new Investor(100, "Karuppu Raja N", "Madurai",100000);
		inv.setAmount(100);
		System.out.println(inv);
		System.out.println(inv.equals(inv1));
		boolean j=inv==inv1;
		System.out.println(inv==inv1);
	}
}
