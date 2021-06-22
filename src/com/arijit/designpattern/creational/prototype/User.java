package com.arijit.designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User implements Cloneable {
	private List<String> userList;
	
	public User() {
		userList = new ArrayList<>();
	}
	
	public User(List<String> userList) {
		this.userList = userList;
	}
	
	public void addUser(String username) {
		userList.add(username);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> newUserList = new ArrayList<>();
		Collections.copy(userList, newUserList);
		
		return new User(newUserList);
	}
	
}
