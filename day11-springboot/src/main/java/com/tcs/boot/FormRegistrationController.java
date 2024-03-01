package com.tcs.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
@RequestMapping("/formregistration")
public class FormRegistrationController {
	@PostMapping
	public String processForm(@RequestParam String lname,
			@RequestParam String mobile, @RequestParam String email, Model model ) {
		model.addAttribute("name", lname);
		model.addAttribute("mobile", mobile);
		model.addAttribute("email", email);
		return "home";
	}
 
}