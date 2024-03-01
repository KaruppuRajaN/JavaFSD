package com.tcs.rest.services;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.rest.repository.ProductRepository;
import com.tcs.rest.resource.Product;

@Service
public class ProductService {
	@Autowired
	ProductRepository repo;
	
	public List<Product> getProducts() {
		return repo.findAll();
	}
	
	public Product getProductById(int id) {
		Optional<Product> product = repo.findById(id);
		return product.get();
	}
	
	public Product save(Product product) {
		return repo.save(product);
	}
	
	public Product update(Product product) {
		Product tempProduct = repo.findById(product.getPid()).get();
		tempProduct.setDescription(product.getDescription());
		tempProduct.setAmount(product.getAmount());
		return repo.save(tempProduct);
	}
	
	public String delete(int id) {
		repo.deleteById(id);
		return "Successfully Deleted";
	}

}
