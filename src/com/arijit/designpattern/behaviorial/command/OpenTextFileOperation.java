package com.arijit.designpattern.behaviorial.command;

public class OpenTextFileOperation implements TextFileOperation {

	private TextFile file;
	
	public OpenTextFileOperation(TextFile file) {
		this.file = file;
	}
	
	@Override
	public String execute() {
		return file.open();
	}

}
