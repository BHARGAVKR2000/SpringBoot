package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim {

	@Override
	public void call() {
		System.out.println("call from airtel Sim");

	}

	@Override
	public void data() {
		System.out.println("Using internet from airtel sim");

	}

}
