package com.arijit.designpattern.behaviorial.command;

public class TextFile {
	private String name;
	
	public TextFile(String name) {
		this.name = name;
	}
	
	public String open() {
		return "Opening Text file " + name;
	}
	
	public String save() {
		return "Saving Text file " + name;
	}
}
