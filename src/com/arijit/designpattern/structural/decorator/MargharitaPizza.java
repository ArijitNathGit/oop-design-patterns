package com.arijit.designpattern.structural.decorator;

public class MargharitaPizza extends PizzaDecorator {

	private String desctiption;
	
	public MargharitaPizza() {
		desctiption = "Margharita Pizza";
	}
	
	@Override
	public int getCost() {
		return 150;
	}
	
}
