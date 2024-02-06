package com.tcs.oops;

public class CreateInvestors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Investor inv = new Investor();
		System.out.println(Investor.class);
		inv.id=101;
		inv.name="Raja";
		inv.address="Madurai";
		inv.amount=1000;
		System.out.println(inv);

	}

}
