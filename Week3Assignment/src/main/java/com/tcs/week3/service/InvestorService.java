package com.tcs.week3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tcs.week3.model.Investor;
import com.tcs.week3.repository.InvestorRepository;

@Service
public class InvestorService {
	@Autowired
	InvestorRepository invrepo;
	
	public String addInvestor(Investor inv) {
		try {
			invrepo.save(inv);
			return "Investor Created Successfully!!!";
		}
		catch(Exception e) {
			return "Investor Not Created Successfully!!!";
		}
		
	}
	public  Investor getInvestor(int id) {
		try {
			Optional<Investor> opt = invrepo.findById(id);
			if(opt==null)
				return null;
			return opt.get();
		}
		catch(Exception e) {
			return null;
		}
		
	}
	public String updateInvestor(int id,double amount) {
		Investor inv = invrepo.findById(id).get();
		inv.setAvailableAmount(inv.getAvailableAmount()-amount);
		try {
			invrepo.save(inv);
			return "Investor Updated Successfully!!!";
		}
		catch(Exception e) {
			return "Investor Not Updated Successfully!!!";
		}
	}
	
	public String deleteInvestor(int id) {
		try {
			invrepo.deleteById(id);
			return "Investor Deleted Successfully!!!";
		}
		catch(Exception e) {
			
		invrepo.deleteById(id);
		return "Investor Not Deleted Successfully!!!";
		}
	}
	
	public List<Investor> getAllInvestors(){
		return invrepo.findAll();
	}
}
