package com.arijit.designpattern.structural.proxy;

/**
 * According to GoF: "Provide a surrogate or placeholder for another object to control access to it"
 * 
 * The definition itself is very clear and proxy design pattern is used when we want to provide controlled access of a functionality.
 * 
 * */
public class ProxyDesignPattern {

	public static void main(String[] args) {
		CommandExecuor authCommand = new AuthCommandExecutor();
		
		CommandExecuor commandProxy1 = new CommandExecutorProxy(true, authCommand);
		commandProxy1.execute("AuthFacebook");
		
		CommandExecuor commandProxy2 = new CommandExecutorProxy(false, authCommand);
		commandProxy2.execute("AuthFacebook");
	}

}
