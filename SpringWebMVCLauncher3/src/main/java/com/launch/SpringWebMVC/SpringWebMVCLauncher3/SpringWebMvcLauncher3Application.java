package com.launch.SpringWebMVC.SpringWebMVCLauncher3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * In this project we are going to implement Basic spring web application with multiple layers(web and service layer)
 * 		Only thing to check is how @Bean and @Autowired annotations are used in case of creating beans for classes from existing libraries
 * 			We have getCurrentTime class were we are creating a bean of method that returns object of type LocalTime(From Java Standard Library) and we Autowire it to GreetingService 
 * 
 * 
 * We also added a spring-boot-dev-tools-dependency so that we don't need to manually re-deploy the application every time we make changes to the application
 * 		**Don't forget to add jasper to complie JSP files**
 */
@SpringBootApplication
public class SpringWebMvcLauncher3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebMvcLauncher3Application.class, args);
	}

}
