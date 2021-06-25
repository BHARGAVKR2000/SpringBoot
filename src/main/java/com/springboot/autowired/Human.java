package com.springboot.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human{

	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;
	
	

	public void startPumping() {
		heart.pump();
		System.out.println("The species name is: "+heart.getSpecies()+" and No.of hearts is: "+heart.getNoOfHearts());
	}

}
