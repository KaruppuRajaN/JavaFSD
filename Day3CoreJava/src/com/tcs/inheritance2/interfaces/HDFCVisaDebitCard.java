package com.tcs.inheritance2.interfaces;

public class HDFCVisaDebitCard extends Card {

	public HDFCVisaDebitCard() {
		super();
	}

	public HDFCVisaDebitCard(int cardNo, String expiry, int cvv, String name, int pin, double amount) {
		super(cardNo, expiry, cvv, name, pin, amount);
	}

	@Override
	public boolean swipe(double transactionAmount) {
		//First get the balance from account
		//Based on card no of the customer
		//update the account balance with transactionAmount
		System.out.println("Transaction Successful - HDFC");
		return true;
	}

}
