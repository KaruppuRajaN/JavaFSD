package com.tcs.collections;
import java.util.*;

public class InvestmentTransactions {
	ArrayList<Transaction> transactions = new ArrayList<>();
	public boolean addTransactin(Transaction t) {
		boolean flag = transactions.add(t);
		return flag;
	}
	public void showTransactions() {
		//System.out.println(transactions);
//		for(Transaction t:transactions) {
//			System.out.println(t);
//		}
		Iterator<Transaction> it=transactions.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public Transaction showGivenTransaction(int id) {
		for(Transaction t:transactions) {
			if(t.getTid()==id)
				return t;
		}
		return null;
	}
	public boolean updateTransaction(int id,double amount,int iid) {
		for(Transaction t:transactions) {
			if(t.getTid()==id) {
				t.setInvestorId(iid);
				t.setTranAmount(amount);
				return true;
			}
		}
		return false;
	}
}
