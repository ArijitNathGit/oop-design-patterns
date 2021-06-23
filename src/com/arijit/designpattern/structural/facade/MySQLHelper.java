package com.arijit.designpattern.structural.facade;

public class MySQLHelper implements SqlHelper {

	@Override
	public boolean generateConnection() {
		System.out.println("MySQL Connection Generated");
		return true;
	}

	@Override
	public void getPDFReport(String tableName) {
		System.out.println("MySQL PDF Report");		
	}

	@Override
	public void generateHTMLReport(String tableName) {
		System.out.println("MySQL HTML Report");		
	}

}
