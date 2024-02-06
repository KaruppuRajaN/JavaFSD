package com.tcs.oops.encapsulation;

public class CreateInvestors {

	public static void main(String[] args) {
		Investor inv = new Investor();
		inv.setId(102);
		inv.setName("Ravi");
		inv.setAddress("Chennai");
		inv.setAmount(10000);
		System.out.println(inv.getAddress());
		
		Investor inv2 = new Investor();
		inv2.setId(102);
		inv2.setName("Ravi");
		inv2.setAddress("Chennai");
		inv2.setAmount(10000);
		System.out.println(inv+"\n"+inv2);
		Investor i3=inv2;
		Investor t2 = inv2=i3;
		i3=null;
		System.out.println(null==null);

	}

}
