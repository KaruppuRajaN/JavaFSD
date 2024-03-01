package com.tcs.mysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProductController {
	@Autowired
	ProductRepository repo;
	@GetMapping("/go")
	public List<Product> getProducts(){
		List<Product> pr=repo.findAll();
		return pr;
	}
}
