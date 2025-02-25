package com.launch.SpringWebMVC.SpringWebMVCLauncher3.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.launch.SpringWebMVC.SpringWebMVCLauncher3.service.GreetingService;

import jakarta.servlet.http.HttpServletResponse;



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
	
	
	/*
	 * In this controller we are going to use Servlet objects of type (HttpServeletResponse and HttpServletRequest)
	 */
	@GetMapping("/greet")
	public void greetingsController(HttpServletResponse response) throws IOException {
		String greet = greetingService.greetingMessage("Goutham!");
		PrintWriter writer = response.getWriter();
		
		// We can print response directly from controller but this isn't recommended at all and we need to respond only from view part
		writer.println("<h1>I am responding from contoller directly </h1>");
		writer.println("<h2>"+ greet+ "</h2>");
		
	}
}
