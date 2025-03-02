package com.launch.SpringWebMVC.SpringWebMVCLauncher3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * In project  we will be exploring how to collect data from a form 
 * 	>> Unlike in servlet where we use getParameter() method to collect each field of form data
 * 		Here we create a POJO for form object and collect the entire data using it
 * >> Spring will automatically collect the data will call the setters and constructor and return the object of this class 
 * 
 * >> We created a PostMapping class which accepts objects of type Employee.
 * >> When the customer register and clicks on submit button
 * 		>> register.jsp will automatically invoke PostMethod and pass employee object with parameters passed in the form
 * 	   >> It in turn invokes sucess.jsp and prints final output


 */
@SpringBootApplication
public class SpringWebMvcLauncher3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebMvcLauncher3Application.class, args);
	}

}
