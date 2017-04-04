package com.demo;

import com.polymorphism.Animal;
import com.polymorphism.Cat;
import com.polymorphism.Dog;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		System.out.println("Cat call function eat:");
		a1.eat();
		
		System.out.println("Dog call function eat:");
		a2.eat();
	}

}
