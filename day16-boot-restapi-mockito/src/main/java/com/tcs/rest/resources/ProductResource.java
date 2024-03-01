package com.tcs.rest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.rest.resource.Login;
import com.tcs.rest.resource.Product;
import com.tcs.rest.services.ProductService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/investmentapp")
public class ProductResource {
	@Autowired
	ProductService service;
	
	@PostMapping("/login")
	public String login(@RequestBody Login login) {
		System.out.println(login.getUsername()+" - "+login.getPassword());
		return "Success";
	}
	
	@GetMapping
	public String check() {
		return "/product/api.1.0";
	}
//	@PostMapping
//	public Product check(@RequestBody Product pi) {
//		return pi;
//	}
	
	@GetMapping("/allproducts")
	public List<Product> getAllProducts(){
		return service.getProducts();
	}
	
	@GetMapping("/productid/{id}")
	public Product fetchProduct(@PathVariable int id){
		return service.getProductById(id);
	}
	
	@PostMapping
	@RequestMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
					produces=MediaType.APPLICATION_JSON_VALUE,
					value="/addproduct")
	public Product createProduct(@RequestBody Product product) {
		return service.save(product);
	}
	
	@PutMapping
	@RequestMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
	produces=MediaType.APPLICATION_JSON_VALUE,
	value="/modifyproduct")
	public Product updateProduct(@RequestBody Product product) {
		return service.update(product);
	}
	
	@DeleteMapping("/deleteproductid/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.delete(id);
	}
	
}
