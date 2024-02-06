package com.tcs.oops.encapsulation.Constructors;

public class CreateInvestors {
	public static void main(String[] args) {
		Investor inv = new Investor();
		System.out.println(inv);
		
		inv=new Investor(100, "Karuppu Raja N", "Madurai",100000);
		System.out.println(inv);
		
		Investor inv1=new Investor(100, "Karuppu Raja N", "Madurai",100000);
		inv.setAmount(100);
		System.out.println(inv.hashCode()+" - "+inv1.hashCode());
		System.out.println(inv.equals(inv1));
		boolean j=inv==inv1;
		System.out.println(inv==inv1);
	}
}
