/*
 * Important components of SpringMVC

	1) Front Controller:
		In Spring WebMVC the Front Controller is DispatcherServlet which is a ready made servlet component
	2) Handler Mapping
	3) Controller
	4) view Resolver
	5) View Components

There are two kind of web requests
1) Client to Business
2) Business to business 

In case of Client to Business web requests:

	1.	Front Controller (DispatcherServlet) Receives the Request:
	•	The request first goes to DispatcherServlet, which acts as the Front Controller.
	•	It is defined in web.xml or auto-configured in Spring Boot.
	2.	Handler Mapping Identifies the Controller:
	•	DispatcherServlet consults a HandlerMapping to determine which controller and method should handle the request.
	•	This is based on URL patterns and annotations (@RequestMapping, @GetMapping, etc.).
	3.	Request is Forwarded to the Appropriate Controller:
	•	DispatcherServlet invokes the controller method that matches the request.
	•	The controller processes the request and may use a service layer to fetch/process data.
	4.	Controller Returns Model and View Name:
	•	The controller method typically returns a ModelAndView object (Model = Data, View = View name).
	5.	View Resolver Resolves the View File:
	•	DispatcherServlet consults a ViewResolver to determine the actual view file.
	•	The ViewResolver maps the logical view name (home) to a physical file (e.g., /WEB-INF/views/home.jsp or home.html in Thymeleaf).
	6.	Final Rendering of the View:
	•	The resolved view file (JSP, Thymeleaf, etc.) is populated with data from the Model.
	•	The view is then rendered into an HTML response and sent back to the client.

JAR vs WAR files:

JAR consists of collection of .class files and WAR file is the collection of entire web application. 
It is the WAR file which gets deployed on the server. When we are deploying the spring boot application in the embedded Tomcat server 
	then we can select Jar of War packaging while generating a Spring Boot project but if we are planning to deploy it on any other server 
	it’s mandatory to create a war packaging .
 */

/*
 * In this project we are going to implement an older method of implementing request mapping and creating an Model and view object using ModelAndView class
 * 		but this way of declaration is no longer in use......... Check controller class
 * 			There is explanation in controller class 
 */

/*
 * We are adding properties in application.properties file for view resolver to determine the actual view file which came to DispatcherServlet 
 * 	We added : spring.mvc.prefix=/  this will take it to webapp. if we have any sub-folder in webapp we can add the following path over there
 *  We also added : spring.mvc.prefix=/
spring.mvc.prefix=.jsp    to let it know that the file of type jsp
 */

/*  
 * JSP files need to be compiled into servlets before Tomcat can process them.
	•	Tomcat’s Jasper engine handles this JSP compilation.
	
	We need to add the below dependency
	<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
    <version>10.1.16</version>
</dependency>
 */


/*
 *  Main HTTP requests 
 *  	1) GET : For client to request data form server
 *  			 No request body
 *  			 Data sent via URL parameters
 *  	2) POST :  Send data to the server to create or update resources.
 *  			   Request body contains data 
 *  			  Not Idempotent: repeated requests can create multiple resources
 *  	3) PUT :
 *  			Update an existing resource or create it if it doesn’t exist
 *  			Request body contains the entire resource
 *  			Idempotent (repeated requests yield the same result)
 *  			
 *  	4) DELETE :
 *  			Remove a resource from the server.
 *  			Usually no request body.
 *  			Idempotent (repeated requests yield the same result).
 *  	
 *  	5) PATCH
 *  		Partially update an existing resource.
 *  		Only sends the modified fields.
 *  
 *  	6) OPTIONS
 *  		The OPTIONS method is used to describe the communication options for the target resource. 
 *  		It lets the client know which HTTP methods and other capabilities are supported by the server for a specific URL.
 *			Purpose: Describe communication options for the target resource.
 *			Use Case: CORS (Cross-Origin Resource Sharing) preflight checks.
 *
 *		7) HEAD
 *			Purpose: Same as GET but only retrieves headers (no body).
 *			Use Case: Checking resource existence or last modification date.
 *  		
 */

/*
 * From Spring 4 
 * 	We have @GetMapping, @PostMapping, @PutMapping, @DeleteMapping
 * 	Instead of specifying in RequestMapper whose syntax is => @RequstMapping(value="",method =RequestMethod.GET/PUT/POST...)
 * 
 * We used @GetMapping in one of our methods in controller 
 */

package com.springWebMVC.lauch.SpringWebMVCLauncher1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebMvcLauncher1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebMvcLauncher1Application.class, args);
	}

}
