package com.abstraction;

public abstract class Animal {
	protected String name;
	
	Animal(){}
	
	Animal(String _name){
		this.name = _name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void eat();
}
