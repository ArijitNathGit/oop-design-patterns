package com.arijit.designpattern.structural.decorator;

public class PeppyPizza extends PizzaDecorator {

	private String desctiption;
	
	public PeppyPizza() {
		desctiption = "Peppy Pizza";
	}
	
	@Override
	public int getCost() {
		return 100;
	}
	
}
