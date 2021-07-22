package com.arijit.designpattern.behaviorial.command;

import java.util.ArrayList;
import java.util.List;

public class TextFileCommandExecutor {
	
	private List<TextFileOperation> operations = new ArrayList<>();
	
	public String executeCommand(TextFileOperation operation) {
		operations.add(operation);
		return operation.execute();
	}
}
