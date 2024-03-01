package com.tcs.mvcjsp;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
	@GetMapping("/hi")
	public String login(Model map) {
		System.out.println("Hi");
		ArrayList<String> products = new ArrayList<>();
		products.add("TV");
		products.add("Telephone");
		products.add("Fan");
		products.add("Light");
		products.add("Microphone");
		products.add("Watches");
		products.add("Alexa");
		map.addAttribute("catalog",products);
		return "success";
	}

}
