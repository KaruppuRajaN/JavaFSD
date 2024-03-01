package com.tcs.dockerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Day23SpringDockerApplication {

	@GetMapping
	public String message(){
	return "Hello from Spring boot-Docker";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Day23SpringDockerApplication.class, args);
	}

}
