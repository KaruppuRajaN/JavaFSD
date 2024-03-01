package com.tcs.javaconfig;

import org.springframework.stereotype.Service;

@Service(value = "helloService")
public class HelloService {
	@Autowired
	HelloWorldImpl hello;   //Dependency Injection
	
	void callHello() {
		hello.message();
	}

}
