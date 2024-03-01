package com.tcs.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = com.tcs.security.repository.UserRepository.class)
public class Day20SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day20SpringSecurityApplication.class, args);
	}

}
