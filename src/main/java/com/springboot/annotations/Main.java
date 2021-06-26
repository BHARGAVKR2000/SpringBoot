package com.springboot.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		try {
			College col = context.getBean(College.class);
			col.collegeInfo();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			((AnnotationConfigApplicationContext) context).close();
		}
	}
}
