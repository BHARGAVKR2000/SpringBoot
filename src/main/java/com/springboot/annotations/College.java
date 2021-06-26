package com.springboot.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Autowired
	private Pricipal principal;

	public void collegeInfo() {
		principal.principalInfo();
		System.out.println("The name of the college is Panimalar Engineering College");
	}

}
