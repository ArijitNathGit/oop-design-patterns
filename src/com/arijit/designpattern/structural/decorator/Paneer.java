package com.arijit.designpattern.structural.decorator;

public class Paneer extends PizzaToppingsDecorator {

	private String desctiption;
	private Pizza pizza;
	
	public Paneer(Pizza pizza) {
		desctiption = "Paneer";
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
