package com.launch.SpringWebMVC.SpringWebMVCLauncher3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.launch.SpringWebMVC.SpringWebMVCLauncher3.model.Course;

@Controller
@RequestMapping("/QueryParameter")
public class QueryController {
	/*
	 * Whenever we send data using query parameter, the request comes to the front controller which redirects to specific controller method with the help of handler mapper
	 * 
	 * Along with the request the method should also have the capability to receive the data from the client(check parameters of getCourseInfo() method)
	 * 	
	 * In case of query param the syntax of the url should be : url followed by question mark(?) followed by attributes in key value pair and the url should use "&" to separate query parameters
	 * 		ex: http://localhost:8484/SpringWebMVCLauncher5/QueryParameter/getCourseInfo?cid=1&cname=SpringBoot&price=1234.56
	 */
	
	@GetMapping("/getCourseInfo")
	public String getCourseInfo(Integer cid, String cname, double price, Model model) {
		
		Course course = new Course(cid, cname, price);
		model.addAttribute("course", course);
		return "course";
	}
	
	/*
	 * If we specify different name to query parameter name to its corresponding name in method parameter we use @RequestParam annotation
	 * 	
	 * In the below case we can use name instead of snmae in request parameter
	 *  ex: http://localhost:8484/SpringWebMVCLauncher5/QueryParameter/getCourseInfoDiffPrameter?cid=1&name=SpringBoot&price=1234.56
	 */
	@GetMapping("/getCourseInfoDiffPrameter")
	public String getCourseInfoDiffPrameter(Integer cid, @RequestParam("name")String cname, double price, Model model) {
		
		Course course = new Course(cid, cname, price);
		model.addAttribute("course", course);
		return "course";
	}
	
}
