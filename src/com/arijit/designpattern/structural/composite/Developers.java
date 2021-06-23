package com.arijit.designpattern.structural.composite;

public class Developers implements Employees {

	private int empID;
	private String empName;
	
	public Developers(int empID, String empName) {
		this.empID = empID;
		this.empName = empName;
	}
	
	@Override
	public void printDetails() {
		System.out.println("EmpID : " + empID + ", Emp Name : "+ empName + ", Position: Developer");
	}

}
