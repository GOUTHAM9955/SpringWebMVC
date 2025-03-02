package com.launch.SpringWebMVC.SpringWebMVCLauncher3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.launch.SpringWebMVC.SpringWebMVCLauncher3.model.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping("/register")
	public String register(@ModelAttribute("employee")Employee emp) {
		System.out.println(emp.geteName());
		
		return "Register";
	}

	@PostMapping("/submitEmployeeRegistration")
	public String RegistrationDetails(Model model, @ModelAttribute("employee")Employee emp) {
		model.addAttribute(emp);
		return "Success";
	}
}
