package com.launch.SpringWebMVC.SpringWebMVCLauncher3.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {
	
	@Autowired
	private LocalTime time;

	@Override
	public String greetingMessage(String greet) {
		
		String message;
		int hour = time.getHour();
		if (hour<12) {
			message = "Good Morning!";
		}
		
		else if (hour<18) {
			message = "Good Evening!";
		}
		
		else message ="Good Nyt!";
			
		return "Hello " + greet+ " "+ message;
	}

}
