package com.arijit.designpattern.structural.decorator;

public class Barbeque extends PizzaToppingsDecorator {

	private String desctiption;
	private Pizza pizza;
	
	public Barbeque(Pizza pizza) {
		desctiption = "Barbeque";
		this.pizza = pizza;
	}
	
	@Override
	public int getCost() {
		return pizza.getCost() + 20;
	}

	@Override
	public String description() {
		return pizza.description() + "," + desctiption;
	}

}
