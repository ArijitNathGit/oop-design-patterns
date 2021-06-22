package com.arijit.designpattern.builder;

public class BuilderDesignPattern {

	public static void main(String[] args) {
		User user1 = new User.UserBuilder("Arijit", "Nath", "+91123456789")
						.setEmailId("arijitnath@gmail.com")
						.setHomeTown("Kolkata")
						.setZipcode("123456")
						.build();
		
		User user2 = new User.UserBuilder("Arijit", "Nath", "+91123456789")
				.setEmailId("arijitnath@gmail.com")
				.build();
		
		System.out.println(user1);
		System.out.println(user2);
	}

}

