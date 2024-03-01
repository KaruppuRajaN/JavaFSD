package com.tcs.rest.exception;

import org.springframework.web.bind.annotation.RestController;

import com.tcs.rest.exception.exceptions.InvalidValueException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController("/")
public class ProductResource {
	@GetMapping
	public String message(String str) throws InvalidValueException,Exception {
		if(str==null)
			throw new NullPointerException("Value Not Provided!!!");
		
		boolean isNumeric = str.chars().allMatch(x->Character.isDigit(x));
		if(!isNumeric) {
			throw new InvalidValueException("Characters are in Part of String");
		}
		if(str.length()==1) {
			throw new Exception("Value must be provided with length > 1");
		}
		return "Hello "+Integer.parseInt(str);
	}
	
	

}
