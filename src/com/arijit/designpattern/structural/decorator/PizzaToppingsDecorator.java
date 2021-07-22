package com.arijit.designpattern.structural.decorator;

public abstract class PizzaToppingsDecorator implements Pizza {

	public abstract String description();

	@Override
	public abstract int getCost();

}
