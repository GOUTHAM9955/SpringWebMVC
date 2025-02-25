package com.launch.SpringWebMVC.SpringWebMVCLauncher3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.launch.SpringWebMVC.SpringWebMVCLauncher3.service.GreetingService;



@Controller
public class GreetingController {
	
	@Autowired
	GreetingService greetingService;
	
	@GetMapping("/greet")
	public String greetingsController(Model model) {
		String greet = greetingService.greetingMessage("Goutham!");
		model.addAttribute("message",greet);
		return "greet";
	}
}
