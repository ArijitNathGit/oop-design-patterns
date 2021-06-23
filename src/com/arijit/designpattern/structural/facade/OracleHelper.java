package com.arijit.designpattern.structural.facade;

public class OracleHelper implements SqlHelper {

	@Override
	public boolean generateConnection() {
		System.out.println("Oracle Connection Generated");
		return true;
	}

	@Override
	public void getPDFReport(String tableName) {
		System.out.println("Oracle PDF Report");		
	}

	@Override
	public void generateHTMLReport(String tableName) {
		System.out.println("Oracle HTML Report");		
	}

}
