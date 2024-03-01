package com.tcs.week3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.week3.model.Investor;
import com.tcs.week3.model.Transactions;
import com.tcs.week3.service.InvestorService;
import com.tcs.week3.service.TransactionService;

@RestController
@CrossOrigin( "http://localhost:4200/")
@RequestMapping("/investo/app.1.0")
public class InvestController {
	
	@Autowired
	InvestorService invService;
	
	@Autowired
	TransactionService transService;
	
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE,
			value="/addinvestor")
	public ResponseEntity<String> addInvestor(@RequestBody Investor investor) {
		String responseStr = invService.addInvestor(investor);
		if(responseStr.toLowerCase().contains("not"))
			return new ResponseEntity<>(responseStr, HttpStatus.BAD_REQUEST);
		else			
			return new ResponseEntity<>(responseStr, HttpStatus.CREATED);
		
	}
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE,
			value="/addtransaction")
	public ResponseEntity<String> addTransaction(@RequestBody Transactions transaction) {
		
		String responseStr = transService.addTransaction(transaction);
		if(responseStr.toLowerCase().contains("not"))
			return new ResponseEntity<>(responseStr, HttpStatus.BAD_REQUEST);
		else			
			return new ResponseEntity<>(responseStr, HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/getallinvestors")
	public ResponseEntity<List<Investor>> getAllInvestor() {
		return new ResponseEntity<>(invService.getAllInvestors(),HttpStatus.OK);
		
	}
	
	@GetMapping("/getinvestor")
	public ResponseEntity<Investor> getInvestor(@RequestParam int id) {
		return new ResponseEntity<>(invService.getInvestor(id),HttpStatus.OK);
		
	}
	

	@GetMapping("/getalltransactions")
	public ResponseEntity<List<Transactions>> getAllTransactions() {
		return new ResponseEntity<>(transService.getAllTransactions(),HttpStatus.OK);
		
	}
	
	@PutMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE,
			value="/updateinvestor")
	public ResponseEntity<String> updateInvestor(@RequestBody Transactions transaction) {
		String responseStr = invService.updateInvestor(transaction.getInvID(),transaction.getSpentAmount());
		if(responseStr.toLowerCase().contains("not"))
			return new ResponseEntity<>(responseStr, HttpStatus.BAD_REQUEST);
		else			
			return new ResponseEntity<>(responseStr, HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("deletetransaction")
	public ResponseEntity<String> deleteTransaction(@RequestParam int id) {
		String responseStr = transService.deleteTransaction(id);
		if(responseStr.toLowerCase().contains("not"))
			return new ResponseEntity<>(responseStr, HttpStatus.BAD_REQUEST);
		else			
			return new ResponseEntity<>(responseStr, HttpStatus.CREATED);
		
	}
	
	
	

}
