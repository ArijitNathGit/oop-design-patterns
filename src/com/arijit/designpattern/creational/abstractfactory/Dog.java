package com.arijit.designpattern.creational.abstractfactory;

public class Dog implements Animal {

	@Override
	public void getType() {
		System.out.println("Dog");		
	}

	@Override
	public void makeSound() {
		System.out.println("Bhoow Bhoow");
	}

}
