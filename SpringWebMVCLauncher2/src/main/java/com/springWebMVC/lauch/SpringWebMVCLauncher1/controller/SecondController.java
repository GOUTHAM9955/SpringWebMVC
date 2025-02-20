package com.springWebMVC.lauch.SpringWebMVCLauncher1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/home1")
public class SecondController
{
	@GetMapping("/welcome")
	public String diplayResponse(Model model) {
		
		System.out.println("Implementation class of model obejct is"+model.getClass().getName());
		model.addAttribute("message","Same end point when we have class level mapping");
		return "index";
	}
}
