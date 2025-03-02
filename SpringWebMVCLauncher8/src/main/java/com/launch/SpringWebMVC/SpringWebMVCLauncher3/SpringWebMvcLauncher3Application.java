package com.launch.SpringWebMVC.SpringWebMVCLauncher3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.launch.SpringWebMVC.SpringWebMVCLauncher3.model.Employee;

/*
One-way binding means that data flows in a single direction, either from the model (backend) to the view (UI) or from the view to the model. In this case, 
	the UI does not automatically reflect changes made in the model, and user inputs are manually collected and mapped to backend objects. 
	On the other hand, two-way binding enables automatic synchronization between the model and the UI, meaning that when the model data changes, 
	the UI is updated accordingly, and when the user updates the UI, those changes are reflected in the model. In Spring MVC, 
	two-way binding is achieved using @ModelAttribute along with Spring form tags, ensuring seamless data exchange between the form fields and backend objects, 
	reducing manual data handling and improving efficiency.
*/


/*
 * In project  we will be exploring two way binding 
 * For two way binding we require SpringTag Library by adding the following tag in the JSP page:
 * 		<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
 * 
 * 	1) In the form tag we make few changes
 * 	We can also go through the documentation at: https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/view.html
 * 		a) instead of <form we use <form:form tag 
 * 		b) We add one more attribute called modelAtrribute and give the reference to it.
 * 			"<form:form action="submitEmployeeRegistration" method="post" modelAttribute="employee">"  
 * 		c) In input tag we make following changes
 * 				old: <input type="text" name="eId" required>
 * 				new: <form:input path="eId"/>
 * 	2) In PostMapping Controller method we add a new annotation to Employee object and pass the parameter name same as what we declared in form form tag for that
 * 		 modelAttribute: CHECK CONTROLLER
 * 			>> public String RegistrationDetails(Model model, @ModelAttribute("employee")Employee emp);
 * 
 * 	3) 	Since the form is register.jsp is now using SpringTag Library and controller of register method is pointing to the page we have pass the ModelAttribute to that page
 * 		
 *        And also we declared pre-dified values for form fields in the POJO class
 *  
 *  Important observation:
 *  		Spring uses reflection and default constructors to create instances of model attributes before binding form data to them. 
 *  		If your POJO does not have a zero-argument constructor, Spring cannot instantiate the object properly.
 *  
 */	
@SpringBootApplication
public class SpringWebMvcLauncher3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebMvcLauncher3Application.class, args);
	}

}
