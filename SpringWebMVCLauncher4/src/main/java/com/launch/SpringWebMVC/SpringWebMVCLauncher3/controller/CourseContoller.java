package com.launch.SpringWebMVC.SpringWebMVCLauncher3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.launch.SpringWebMVC.SpringWebMVCLauncher3.model.Course;

@Controller
public class CourseContoller {
	
	@GetMapping("/getCourseDetails")
	public String displayCourseDetails(Model model){
		Course course = new Course(1,"SPRING BOOT", 123.45);
		model.addAttribute("course", course);
		return "course";
	}
}
