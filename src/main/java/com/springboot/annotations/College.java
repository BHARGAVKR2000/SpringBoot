package com.springboot.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	
	private String collegeName;

	@Autowired
	@Qualifier("mathTeacher")
	private Teacher teacher;

	@Autowired
	private Pricipal principal;
	
	@Value("${college.name}")
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	

	public void collegeInfo() {
		principal.principalInfo();
		System.out.println("The name of the college is: " + collegeName);
		teacher.teacherInfo();
	}

}
