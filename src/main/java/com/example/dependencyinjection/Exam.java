package com.example.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		try {
		Student alex = context.getBean("alex", Student.class);
		alex.showStudentInfo();
		}
		finally {
			((ClassPathXmlApplicationContext) context).close();
		}

	}
}
