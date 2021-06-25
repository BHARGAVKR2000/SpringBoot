package com.example.dependencyinjection;

public class Student2 {
	
	private MathCheat math;

	public void setMath(MathCheat math) {
		this.math = math;
	}
	
	public void cheat() {
		math.cheating();
	}

}
