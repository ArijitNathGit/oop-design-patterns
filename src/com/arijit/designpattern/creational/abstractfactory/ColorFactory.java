package com.arijit.designpattern.creational.abstractfactory;

public class ColorFactory implements AbstractFactory<Color> {

	@Override
	public Color create(String type) {
		if("Ref".equals(type)) return new Red();
		else return new Green();
	}

}
