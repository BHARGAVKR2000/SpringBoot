package com.springboot.annotations;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teacherInfo() {
		System.out.println("Hi iam your math Teacher..");
		
	}

}
