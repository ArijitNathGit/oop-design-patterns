package com.arijit.designpattern.creational.abstractfactory;

public class Bear implements Animal {

	@Override
	public void getType() {
		System.out.println("Bear");
	}

	@Override
	public void makeSound() {
		System.out.println("Whooor");
	}

}
