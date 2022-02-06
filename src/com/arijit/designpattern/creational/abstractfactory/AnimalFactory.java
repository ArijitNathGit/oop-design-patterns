package com.arijit.designpattern.creational.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal> {

	@Override
	public Animal create(String type) {
		if("Dog".equals(type)) return new Dog();
		else return new Bear();
	}

}
