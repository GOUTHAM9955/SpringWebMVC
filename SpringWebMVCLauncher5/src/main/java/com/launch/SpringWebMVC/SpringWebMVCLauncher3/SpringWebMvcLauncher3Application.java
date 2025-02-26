package com.launch.SpringWebMVC.SpringWebMVCLauncher3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * Till now we have implemented ways of sending data to client using controller's. In this project we are going to explore how we can receive data from customer for which we have 3 different ways
 * 	1) Query Parameter
 * 	2) Path Parameter
 * 	3) Form 
 * 
 * In this project we are going to explore Query and Path parameter
 * 	 In both the above mentioned methods we send the data in the url itself so, can be used in case of when we are sending non-critical data 
 * 
 * 
 * CHECK COMTROLLER CLASSES OF QUERY AND PATH PARAMETER 
 */

/*
 * One additional point is, we can have multiple end points for single controller method(We can expose API's with multiple end points):
 * 		Ex: 	@GetMapping({"/getCourseInfo","/getCourseDetails","/getCourseData"})
 */

@SpringBootApplication
public class SpringWebMvcLauncher3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebMvcLauncher3Application.class, args);
	}

}
