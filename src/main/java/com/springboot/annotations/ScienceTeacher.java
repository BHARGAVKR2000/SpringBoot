package com.springboot.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher {

	@Override
	public void teacherInfo() {
		System.out.println("HI iam your Science teacher..");
		
	}

}
