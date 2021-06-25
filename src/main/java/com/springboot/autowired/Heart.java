package com.springboot.autowired;

public class Heart {

	private String species;
	private int noOfHearts;

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
		System.out.println("heart is pumping..");
	}
}
