package com.arijit.designpattern.creational.prototype;

public class PrototypeDesignPattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User();
		user.addUser("Arijit");
		user.addUser("Ritchie");
		
		System.out.println(user);
		
		User userClone = (User) user.clone();
		System.out.println(userClone);
	}

}

