package com.polymorphism;

public class Animal {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat(){
		System.out.println("Animal eat...");
	}
}
