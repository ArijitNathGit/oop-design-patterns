package com.arijit.designpattern.creational.factory;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("16GB", "Intel", "500GB", "PC");
		Computer server = ComputerFactory.getComputer("64GB", "Intel", "5TB", "Server");
		
		System.out.println(pc);
		System.out.println(server);
	}
	
}