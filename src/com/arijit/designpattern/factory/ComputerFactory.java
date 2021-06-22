package com.arijit.designpattern.factory;

public class ComputerFactory {
	public static Computer getComputer(String RAM, String CPU, String HDD, String type) {
		switch(type) {
			default:
			case "PC":
				return new PC(RAM, CPU, HDD);
			case "Server":
				return new Server(RAM, CPU, HDD);				
		}
	}
}