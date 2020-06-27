package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import ch.qos.logback.core.Context;

@SpringBootApplication
public class LearningConceptsApplication {

	public static void main(String[] args) {
		
		  
		        for(String arg:args) {
		            System.out.println(arg);
		        }
		        SpringApplication.run(LearningConceptsApplication.class, args);
		   }

}
