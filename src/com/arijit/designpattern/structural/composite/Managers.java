package com.arijit.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Managers implements Employees {
	
	private int empID;
	private String empName;
	private List<Employees> allDevelopers;
	
	public Managers(int empID, String empName) {
		this.empID = empID;
		this.empName = empName;
		allDevelopers = new ArrayList<>();
	}
	
	public void showDevelopers() {
		allDevelopers.forEach(dev -> dev.printDetails());
	}
	
	public void addDeveloper(Employees developer) {
		this.allDevelopers.add(developer);
	}
	
	public void removeDeveloper(Employees developer) {
		this.allDevelopers.remove(developer);
	}
	
	@Override
	public void printDetails() {
		System.out.println("EmpID : " + empID + ", Emp Name : "+ empName + ", Position: Manager");
	}

}
