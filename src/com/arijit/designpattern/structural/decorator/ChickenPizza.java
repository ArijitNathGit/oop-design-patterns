package com.arijit.designpattern.structural.decorator;

public class ChickenPizza extends PizzaDecorator {

	private String desctiption;
	
	public ChickenPizza() {
		desctiption = "Chicken Pizza";
	}
	
	@Override
	public int getCost() {
		return 200;
	}
	
}
