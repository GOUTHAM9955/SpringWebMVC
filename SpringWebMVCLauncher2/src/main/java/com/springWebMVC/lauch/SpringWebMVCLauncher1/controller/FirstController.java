package com.springWebMVC.lauch.SpringWebMVCLauncher1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/home")
public class FirstController
{
	@GetMapping("/welcome")
	public String diplayResponse(Model model) {
		
		System.out.println("Implementation class of model obejct is"+model.getClass().getName());
		model.addAttribute("message","This is my first page passing Model object into controller method and return view page name to it");
		return "index";
	}
}
