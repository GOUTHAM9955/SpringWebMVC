package com.springWebMVC.lauch.SpringWebMVCLauncher1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@RequestMapping("/welcome")
	public ModelAndView firstDisplay(){
	ModelAndView mav = new ModelAndView();
	
	// We add model object in key value pair, we will use that "message" key in our JSP page
	mav.addObject("message", "This is my first view object in spring MVC ");
	
	// Since we named the view object as view we need to have a view file in src/main/webapp
		// If you created a Jar file create a webapp folder in src/main
	mav.setViewName("index");
	return mav;
	}
}
