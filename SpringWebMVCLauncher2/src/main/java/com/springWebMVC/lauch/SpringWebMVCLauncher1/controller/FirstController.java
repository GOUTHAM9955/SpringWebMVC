package com.springWebMVC.lauch.SpringWebMVCLauncher1.controller;

import java.util.Map;

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
	
	
	// We can also make this request non-invasive(less dependent on Spring Framework)
	@GetMapping("/welcome1")
	public String displayResponse2(Map<String, Object> map) {
		map.put("message","I am printing this page to implement contoller methods which are non-invassive");
		
		// This map class will also be implemented by BindingAwareModelMap
		System.out.println("Implementation class of model obejct is"+map.getClass().getName());
		return "index";
		
	}
	
	/* When Jsp page and front end mapping has same name ex:/welcome3 in this case, we don't explicitly need to
			method the return type but it is not recommended
	 AND ALSO WE SHOULDN"T HAVE RequestMapping on class type
	
	*/@GetMapping("/welcome3")
	public void displayResponse3(Map<String, Object> map) {
		map.put("message","I am printing this page to implement contoller methods which are non-invassive");
		
	}
}





