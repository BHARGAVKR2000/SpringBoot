package com.springboot.autowired;

import org.springframework.beans.factory.annotation.Value;

public class Heart {

	private String species;
	private int noOfHearts;
	
	@Value("Heart")
	private String name;

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getNoOfHearts() {
		return noOfHearts;
	}

	public void setNoOfHearts(int noOfHearts) {
		this.noOfHearts = noOfHearts;
	}

	public void pump() {
		System.out.println(name+" is pumping..");
	}
}
