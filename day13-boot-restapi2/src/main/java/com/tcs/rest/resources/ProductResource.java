package com.tcs.rest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.rest.resource.Product;
import com.tcs.rest.services.ProductService;

@RestController
@RequestMapping("/product/api.1.0")
public class ProductResource {
	@Autowired
	ProductService service;
	
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
	//@ResponseStatus(code = HttpStatus.CREATED)
//	public ResponseEntity<String> createProduct(@RequestBody Product product) {
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
//		service.save(product);
//		return ResponseEntity.status(HttpStatus.CREATED).body("Created Your Requested Object");
		
		
//		HttpHeaders header=new HttpHeaders();
//		header.add("secret","Vanakkam da Mapla");
// return ResponseEntity.status(HttpStatus.CREATED).headers(header).body(service.save(product));
//		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(product));
return new ResponseEntity(service.save(product), HttpStatus.CREATED);
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
