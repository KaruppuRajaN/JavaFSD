package com.tcs.week3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.week3.model.Investor;
import com.tcs.week3.model.Transactions;
import com.tcs.week3.repository.TransactionsRepository;

@Service
public class TransactionService {
	@Autowired
	TransactionsRepository transRepo;
	
	public String addTransaction(Transactions trans) {
		try {
			transRepo.save(trans);
			return "Transaction Created Successfully!!!";
		}
		catch(Exception e) {
			return "Transaction Not Created Successfully!!!";
		}
		
	}
	public  Transactions getTransaction(int id) {
		try {
			Optional<Transactions> opt = transRepo.findById(id);
			if(opt==null)
				return null;
			return opt.get();
		}
		catch(Exception e) {
			return null;
		}
		
	}
	public String updateTransaction(Transactions transs,double amount) {
		Transactions trans = transRepo.findById(transs.getTid()).get();
		trans.setSpentAmount(amount);
		try {
			transRepo.save(trans);
			return "Transaction Updated Successfully!!!";
		}
		catch(Exception e) {
			return "Transaction Not Updated Successfully!!!";
		}
	}
	
	public String deleteTransaction(int id) {
		try {
			transRepo.deleteById(id);
			return "Transaction Deleted Successfully!!!";
		}
		catch(Exception e) {
			
		transRepo.deleteById(id);
		return "Transaction Not Deleted Successfully!!!";
		}
	}
	
	public List<Transactions> getAllTransactions(){
		return transRepo.findAll();
	}
}
