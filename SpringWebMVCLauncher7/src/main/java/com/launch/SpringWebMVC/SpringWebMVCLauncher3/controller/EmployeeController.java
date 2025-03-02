package com.launch.SpringWebMVC.SpringWebMVCLauncher3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.launch.SpringWebMVC.SpringWebMVCLauncher3.model.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping("/register")
	public String register() {
		
		return "register";
	}

	@PostMapping("/submitEmployeeRegistration")
	public String RegistrationDetails(Model model, Employee emp) {
		model.addAttribute(emp);
		return "Success";
	}
}
