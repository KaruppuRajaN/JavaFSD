package com.tcs.service.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;



@RestController
@RequestMapping("/rest/service")
public class SleuthService {
	@Value("name")
	String str;

	private static final Logger logger = LoggerFactory.getLogger(SleuthService.class);
	
	@Autowired
	Environment environment;
	
	@GetMapping
	public String welcome() {
		String port = environment.getProperty("server.port");
		logger.info("From Service");
		return "Programming Microservice @ "+port + " - "+str;
	}
	
	@GetMapping("/status")
	public String status() {
		logger.info("From Service");
		return "Up and Running";
	}
	
	
	
}
