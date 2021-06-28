package com.springboot.annotations;

import org.springframework.stereotype.Component;

@Component
public class EngilshTeacher implements Teacher {

	@Override
	public void teacherInfo() {
		System.out.println("I am your English Teacher...");
		
	}

}
