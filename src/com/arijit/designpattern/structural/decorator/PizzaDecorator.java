package com.arijit.designpattern.structural.decorator;

public abstract class PizzaDecorator implements Pizza {

	@Override
	public String description() {
		return "Pizza";
	}

	@Override
	public abstract int getCost();
}
