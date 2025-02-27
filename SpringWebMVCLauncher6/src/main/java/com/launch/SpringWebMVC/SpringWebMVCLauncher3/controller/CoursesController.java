package com.launch.SpringWebMVC.SpringWebMVCLauncher3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoursesController {
	
	@GetMapping("/home")
	public String homePage() {
		System.out.println("I am in home");
		return "home";
	}
	
	@GetMapping("/coursesResponse")
	public String coursesPage(Model model) {
		String courses[] = new String[] {"Java ","Spring Boot ","Microservices "};
		model.addAttribute("courses",courses);
		return "courses";
	}

}
