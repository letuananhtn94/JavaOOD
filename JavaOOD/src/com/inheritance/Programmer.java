package com.inheritance;

import com.encapsulation.Employee;

public class Programmer extends Employee {
	
	private int age = 23;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;		
	}
	
	public void print(){
		
		System.out.println("Public name is: " + this.publicName);
		
		System.out.println("Age is: " + this.age);
		
		System.out.println("Salary is: " + this.salary + " USD");
		
	}
}
