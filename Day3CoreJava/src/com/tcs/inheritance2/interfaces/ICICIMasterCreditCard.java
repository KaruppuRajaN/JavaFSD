package com.tcs.inheritance2.interfaces;

public class ICICIMasterCreditCard extends Card{

	public ICICIMasterCreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ICICIMasterCreditCard(int cardNo, String expiry, int cvv, String name, int pin, double amount) {
		super(cardNo, expiry, cvv, name, pin, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean swipe(double transactionAmount) {
		//First get the balance from account
		//Based on card no of the customer
		//update the account balance with transactionAmount
		System.out.println("Transaction Successful -ICICI");
		return true;
	}
}
