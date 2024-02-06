package com.tcs.inheritance;

public class CardTransactions {

	public static void main(String[] args) {
		HDFCVisaDebitCard hdfc=new HDFCVisaDebitCard(123,"10/2080",191,"Karuppu Raja N",5323,500000);
		System.out.println(hdfc);
		
		ICICIMasterCreditCard icici = new ICICIMasterCreditCard(234,"10/2040",291,"Ramana",4356,10000);
		hdfc.swipe(100);
		icici.swipe(1000);
		System.out.println(icici);
		Card d=new HDFCVisaDebitCard();
		d.swipe(100);
		d =new ICICIMasterCreditCard(234,"10/2040",291,"Ramana",4356,10000);
		d.swipe(1000);
	}

}
