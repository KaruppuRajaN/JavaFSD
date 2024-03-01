package com.tcs.client.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/api/client")
public class SleuthClientResource {
@Autowired
RestTemplate template;
public static String CLIENT_SERVICE="clientService";
private static final Logger logger = LoggerFactory.getLogger(SleuthClientResource.class);

@GetMapping
@CircuitBreaker(name="CLIENT_SERVICE",fallbackMethod = "callOnFail")
public String callServer() {
	String url = "http://localhost:8093/rest/service/status";
	String output = template.getForObject(url, String.class);
	logger.info("From Client...");
			return output;
}
public String callOnFail(Exception e) {
	logger.info("From Client...");
	return "Message From Call On Fail().........";
}

	
}
