package com.tcs.rest.resources;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.rest.resource.Product;
import com.tcs.rest.resources.ProductResource;
import com.tcs.rest.services.ProductService;

@WebMvcTest(ProductResource.class)
public class ProductResourceTest {

	@MockBean
	ProductService service;
	
	@Autowired
	MockMvc mockMvc; //Makes a dummy HTTP Call like GET, POST, PUT, DELETE
	
	@Test
	public void test_addProduct() throws Exception{
		Product product = new Product(1, "Karbon Button Mobile",1200);
		when(service.save(product)).thenReturn(product);
		
		mockMvc.perform(post("/addproduct").
			contentType(MediaType.APPLICATION_JSON).
			content(
					new ObjectMapper().
					writeValueAsString(product)
					));
			
	}
	@Test
	public void test_allProducts() throws Exception{
		Product product = new Product(1, "Karbon Button Mobile",1200);
		Product product2 = new Product(2, "Intex Button Mobile",12000);
		Product product3 = new Product(3, "Lava Button Mobile",12000);
		when(service.save(product)).thenReturn(product);
		when(service.save(product2)).thenReturn(product);
		when(service.save(product3)).thenReturn(product);
		
		List<Product> productList = new ArrayList<>();
		productList.add(product);
		productList.add(product2);
		productList.add(product3);
		
		mockMvc.perform(get("/allproducts").
			contentType(MediaType.APPLICATION_JSON).
			content(
					new ObjectMapper().
					writeValueAsString(productList)
					));
			
	}
	
}
