package com.arijit.designpattern.structural.facade;

public interface SqlHelper {
	boolean generateConnection();
	void getPDFReport(String tableName);
	void generateHTMLReport(String tableName);
}
