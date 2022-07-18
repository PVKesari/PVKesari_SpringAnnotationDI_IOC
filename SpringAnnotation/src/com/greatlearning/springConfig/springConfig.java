package com.greatlearning.springConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springdemo.sports.ExpertAdvice;
import com.springdemo.sports.PracticeAdvice;

@Configuration
@ComponentScan("com.springdemo.sports")
public class springConfig {
	
	@Bean
	public ExpertAdvice pracAdvice() {
		return new PracticeAdvice();
	}
	

}
