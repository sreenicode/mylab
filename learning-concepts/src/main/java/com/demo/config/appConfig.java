package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class appConfig {
	
	@Bean
	public ModelAndView modelAndView() {
		return new ModelAndView();
	}

}
