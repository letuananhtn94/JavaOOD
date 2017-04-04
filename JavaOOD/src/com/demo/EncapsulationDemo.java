package com.demo;

import com.encapsulation.Employee;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee st = new Employee();
		
		System.out.println("This is public name: " + st.publicName);
		
		System.out.println("This is private name: " + st.getPrivateName());
		
		//
		//System.out.println("This is private name: " + st.privateName);
	}

}
