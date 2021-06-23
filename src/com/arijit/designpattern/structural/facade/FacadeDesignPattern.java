package com.arijit.designpattern.structural.facade;

/**
 * According to GoF: "Provide a unified interface to a set of interfaces in a subsystem. Facade Pattern defines a higher-level interface that makes the subsystem easier to use."
 * */
public class FacadeDesignPattern {

	public static void main(String[] args) {
		SqlHelper mysql = new MySQLHelper();
		SqlHelper oracle = new OracleHelper();
		
		SqlHelperFacade.generateReport(SqlHelperFacade.DBtypes.MYSQL, SqlHelperFacade.ReportTypes.PDF, mysql, "getData");
		SqlHelperFacade.generateReport(SqlHelperFacade.DBtypes.ORACLE, SqlHelperFacade.ReportTypes.HTML, oracle, "getData");
	}

}

