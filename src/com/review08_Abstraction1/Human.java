package com.review08_Abstraction1;

public abstract class Human {
	String name;
	static String planet;

	public Human(String name) {
		this.name = name;
	}

	public abstract void talk();// unimplemented

	public void sleep() {
		// implemented
		System.out.println("All human sleep the same.");
	}
}
