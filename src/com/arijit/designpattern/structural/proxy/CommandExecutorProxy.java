package com.arijit.designpattern.structural.proxy;

public class CommandExecutorProxy implements CommandExecuor {

	private boolean isAdmin;
	private CommandExecuor executor;
	
	public CommandExecutorProxy(boolean isAdmin, CommandExecuor executor) {
		this.isAdmin = isAdmin;
		this.executor = executor;
	}
	
	@Override
	public void execute(String command) {
		if(isAdmin) {
			executor.execute(command);
		}		
		else {
			if (command.trim().toLowerCase().startsWith("auth")) {
				throw new IllegalArgumentException("This command is not allowed no non-admin");
			}
			else {
				executor.execute(command);
			}
		}
	}

}
