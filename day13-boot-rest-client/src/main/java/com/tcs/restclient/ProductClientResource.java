package com.tcs.restclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductClientResource {
	@Autowired
	RestTemplate template;
	
	@GetMapping
	public Object getProduct() {
		Object object = template.getForObject("http://localhost:9090/product/api.1.0/productid/10",Product.class);
		return object;
		
	}

}
