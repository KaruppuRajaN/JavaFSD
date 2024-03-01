package com.tcs.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/Raja")
public class WelcomeController {
	@GetMapping("/go")
	public String method() {
		System.out.println("From Controller....");
		return "welcome";
	}
	
	@PostMapping("/go2")
	public String method2() {
		System.out.println("From Controller....");
		return "welcome";
	}
	
	@RequestMapping("/go2")
	public String method3(Model model) {
		model.addAttribute("welcome", "Hi Welcome to TCS.... Developers");
		System.out.println("From Controller....");
		return "welcome";
	}


}
