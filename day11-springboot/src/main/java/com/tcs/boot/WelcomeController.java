package com.tcs.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping("/hi")
	public String invite() {
		System.out.println("hi");
		return "home";
	}
	
	@GetMapping("/go")
	public String invite1(Model map) {
		map.addAttribute("location","Theni");
		return "home";
	}
	
	@GetMapping("/fine")
	public String invite(Model map) {
		map.addAttribute("location","Chennai1");
 
		return "registrationform";
	}

}
