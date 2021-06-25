package com.springboot.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Octopus {
	
	@Autowired
	@Qualifier("ouctopusHeart")
	private Heart heart;
	
	public void pumping() {
		heart.pump();
		System.out.println("The name of the Species is: "+heart.getSpecies()+" Number of hearts is: "+heart.getNoOfHearts());
	}

}
