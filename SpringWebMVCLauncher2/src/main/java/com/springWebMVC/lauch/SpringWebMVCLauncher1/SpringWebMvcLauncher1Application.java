package com.springWebMVC.lauch.SpringWebMVCLauncher1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * In this project we are exploring instead of us creating ModelAndViewobject we will pass the model object as parameter to controller class
 * 		The implementation of model class we be done by BindingAwareModelMap
 * 		We will add attributes to this model class using addAttributes method as key, value pair
 * 		The return object of this controller will be will be a string with whose name is the view page name
 * 		FYI: Implementation class name of binding object will only be printed in console if and only if we make call to that controller method 
 * 			which will happen only id we send a request through that welcome page
 * 		
 */

/*
 * 	We cannot have controller methods with same end points unless it is of different HttpMethods(but it is not recommended) or if there is a class level url mapping.
 * 		Class level mapping can only be done by @RequestMapping
 * 			The first and second classes have same request mapping(/welcome) in their methods but as we have class mapping they can be same so the points will be "home/welcome"  or  "home1/welcome"
 */

/*
 *  
 */

@SpringBootApplication
public class SpringWebMvcLauncher1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebMvcLauncher1Application.class, args);
	}

}
