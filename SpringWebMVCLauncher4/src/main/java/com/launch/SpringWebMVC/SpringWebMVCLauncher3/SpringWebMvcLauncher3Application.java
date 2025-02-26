package com.launch.SpringWebMVC.SpringWebMVCLauncher3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * In this project we are going to implement how to use pojo class from model object and send the data to view pages
 * 		We added course object to model.addAttribute() method
 * 		In JSP file used name of the attribute and the field names defined in pojo class to get those attributes
 */
@SpringBootApplication
public class SpringWebMvcLauncher3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebMvcLauncher3Application.class, args);
	}

}
