package com.springboot.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.springboot.annotations")
@PropertySource("classpath:application.properties")
public class CollegeConfig {
	
}
