package com.tcs.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day11BootJpaApplication implements CommandLineRunner {

	@Autowired
	ProductRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(Day11BootJpaApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		Product pr = new Product();
		pr.setDescription("MobilePhone");
		pr.setAmount(10000);
		repo.save(pr);
		
		Product pr1 = new Product();
		pr1.setDescription("Modem");
		pr1.setAmount(2000);
		repo.save(pr1);
		
		Product pr2 = new Product();
		pr2.setDescription("Optical Mouse");
		pr2.setAmount(1000);
		repo.save(pr2);
		
	}

}
