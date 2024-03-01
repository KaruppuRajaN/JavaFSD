package com.tcs.rest.services;

import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.tcs.rest.repository.ProductRepository;
import com.tcs.rest.resource.Product;


@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
	
	@InjectMocks
	private ProductService service;
	
	@Mock
	private ProductRepository repository;
	
	@BeforeEach
	void setUp() {
		Optional<Product> optional=Optional.of(new Product(9,"Smart Washing Machine",125000));
		System.out.println(optional.get());
		Mockito.when(repository.findById(9)).thenReturn(optional);
		
		Optional<Product> optional1=Optional.of(new Product(10,"Smart Watch",125000));
		System.out.println(optional1.get());
		Mockito.when(repository.findById(9)).thenReturn(optional);
		
		Optional<Product> optional2=Optional.of(new Product(11,"Smart BiCycle",125000));
		System.out.println(optional2.get());
		Mockito.when(repository.findById(9)).thenReturn(optional);
	}

	@Test
	public void testGetProductById() {
		double expected_price = 125000;
		Product prod = service.getProductById(9);
		assertEquals(expected_price,prod.getAmount());
	}
}
