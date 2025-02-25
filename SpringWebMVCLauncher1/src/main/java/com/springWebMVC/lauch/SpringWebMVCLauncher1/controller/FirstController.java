package com.springWebMVC.lauch.SpringWebMVCLauncher1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FirstController
{
	@RequestMapping("/welcome1")
	public ModelAndView displaySomeResponse()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("message", "Hello! Welcome to our first web app");
		mav.setViewName("index");
		
		return mav;
	}
	
	
	@GetMapping("/welcome2")
	public ModelAndView secondDisplay() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "This is my second paage using GetMapping @annotation");
		mav.setViewName("index");
		return mav;
	}
}
