package com.launch.SpringWebMVC.SpringWebMVCLauncher3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * In this class we will be using JSTL library to iterate over a collection of data
 * 	
 * 	1) We developed two methods in controller class 
 * 		>> One takes you to home page 
 * 		>> We are mapping to other controller in home page jsp file
 * 		>> In second controller we are passing collection object to the model object >>model.addAttribute("courses",courses);
 * 	
 * 2) now in JSP we added a new dependency to read that array object
 * 		>>
			<dependency>
			    <groupId>org.glassfish.web</groupId>
			    <artifactId>jakarta.servlet.jsp.jstl</artifactId>
			    <version>2.0.0</version>
			</dependency>
			
		
			>> We are adding a new link in home page using anchor tag and href to call courseResponse controller from home page instead of explicitly calling it
			 		<a href='coursesResponse'> Click here to get course details</a>
			
		>> We added a uri tag in JSP file at starting:
				<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		
		>> We implemented for each to read each element in the array in jsp file
				<c:forEach var="course" items="${courses}">
				    ${course}
					</c:forEach>

 */
@SpringBootApplication
public class SpringWebMvcLauncher3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebMvcLauncher3Application.class, args);
	}

}
