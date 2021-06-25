package com.example.dependencyinjection;

public class Student1 {
	
	private MathCheat mathCheat;
	
	
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}


	public void cheating() {
		mathCheat.cheating();
	}

}
