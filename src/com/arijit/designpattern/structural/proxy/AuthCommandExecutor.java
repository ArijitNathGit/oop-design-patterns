package com.arijit.designpattern.structural.proxy;

public class AuthCommandExecutor implements CommandExecuor {

	@Override
	public void execute(String command) {
		// Command that requires Authentication 
		System.out.println("Command Executed: " + command);
	}

}
