package com.example.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Student1 student1 = context.getBean("student1", Student1.class);
		student1.cheating();
		Student2 student2 = context.getBean("student2", Student2.class);
		student2.cheat();

		((ClassPathXmlApplicationContext) context).close();
	}
}
