package com.launch.SpringWebMVC.SpringWebMVCLauncher3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.launch.SpringWebMVC.SpringWebMVCLauncher3.model.Course;

@Controller
@RequestMapping("/PathParameter")
public class PathController {
	/*
	 * Whenever we send data using query parameter, the request comes to the front controller which redirects to specific controller method with the help of handler mapper
	 * 
	 * Along with the request the method should also have the capability to receive the data from the client(check parameters of getCourseInfo() method)
	 * 	
	 * In case of path parameter the syntax of the url should be : url followed by question mark(/) followed by attribute values
	 * 		ex: http://localhost:8484/SpringWebMVCLauncher5/PathParameter/getCourseInfo/1/SpringBoot/1234.56
	 */
	
	
	/*
	 * We must and should specify the name of attribute in request mapping => @GetMapping("/getCourseInfo/{cif}/{name}/{price}")
	 * 
	 * And also we should use @PathVariable annotation to parameters in controller method
	 */
	@GetMapping("/getCourseInfo/{cid}/{name}/{price}")
	public String getCourseInfo(@PathVariable("cid")Integer cid, @PathVariable("name")String cname, @PathVariable("price")double price, Model model) {
		Course course = new Course(cid, cname, price);
		model.addAttribute("course", course);
		return "course";
	}
	

}
