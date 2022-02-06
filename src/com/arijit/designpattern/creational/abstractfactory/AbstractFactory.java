package com.arijit.designpattern.creational.abstractfactory;

public interface AbstractFactory<T> {
	T create(String type);
}
