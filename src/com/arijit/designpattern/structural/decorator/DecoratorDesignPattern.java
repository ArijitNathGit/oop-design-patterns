package com.arijit.designpattern.structural.decorator;

public class DecoratorDesignPattern {

	public static void main(String[] args) {
		Pizza pizza = new ChickenPizza();
		Pizza barbeque = new Barbeque(pizza);
		
		System.out.println(barbeque.getCost());
		System.out.println(barbeque.description());

	}

}
