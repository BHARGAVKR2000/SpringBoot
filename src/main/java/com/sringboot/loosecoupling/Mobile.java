package com.sringboot.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Airtel airtel = context.getBean("airtel", Airtel.class);
		airtel.activateService();
	}
}
