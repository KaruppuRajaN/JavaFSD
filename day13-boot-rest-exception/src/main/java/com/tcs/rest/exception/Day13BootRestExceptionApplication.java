package com.tcs.rest.exception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Day13BootRestExceptionApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Day13BootRestExceptionsApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(Day13BootRestExceptionApplication.class, args);
		String beans[] = context.getBeanDefinitionNames();
		for(String bean : beans) {
			System.out.println(bean);
		}
	}

}
