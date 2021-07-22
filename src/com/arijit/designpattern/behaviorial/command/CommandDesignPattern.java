package com.arijit.designpattern.behaviorial.command;

public class CommandDesignPattern {

	public static void main(String[] args) {
		
		TextFile textFile1 = new TextFile("text1.txt"); 
		
		TextFileOperation open = new OpenTextFileOperation(textFile1);
		TextFileOperation save = new SaveTextFileOperation(textFile1);
		
		TextFileCommandExecutor executor = new TextFileCommandExecutor();
		
		System.out.println(executor.executeCommand(open));
		System.out.println(executor.executeCommand(save));
	}

}
