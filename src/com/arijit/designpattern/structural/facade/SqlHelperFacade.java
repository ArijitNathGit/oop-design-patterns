package com.arijit.designpattern.structural.facade;

public class SqlHelperFacade {
	public static void generateReport(DBtypes dbType, ReportTypes reportType, SqlHelper sqlHelper, String tableName) {		
		switch(dbType) {
			case MYSQL:
				sqlHelper.generateConnection();
				switch(reportType) {
					case HTML:
						sqlHelper.generateHTMLReport(tableName);
						break;
					case PDF:
						sqlHelper.getPDFReport(tableName);
						break;
				}
				break;
			case ORACLE:
				sqlHelper.generateConnection();
				switch(reportType) {
					case HTML:
						sqlHelper.generateHTMLReport(tableName);
						break;
					case PDF:
						sqlHelper.getPDFReport(tableName);
						break;
				}
				break;
		}
	}
	
	public static enum DBtypes {
		MYSQL,ORACLE;
	}
	
	public static enum ReportTypes {
		HTML,PDF;
	}
}
