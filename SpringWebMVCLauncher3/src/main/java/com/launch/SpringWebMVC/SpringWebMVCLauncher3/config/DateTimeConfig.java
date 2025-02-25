package com.launch.SpringWebMVC.SpringWebMVCLauncher3.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DateTimeConfig {
	
	@Bean
	public LocalTime getCurrentTime() {
		return LocalTime.now();
	}

}
