package com.arijit.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class GeneralManager implements Employees {

	private int empID;
	private String empName;
	private List<Employees> allManagers;
	
	public GeneralManager(int empID, String empName) {
		this.empID = empID;
		this.empName = empName;
		allManagers = new ArrayList<>();
	}
	
	public void showManagers() {
		allManagers.forEach(Employees::printDetails);
	}
	
	public void addManager(Employees manager) {
		this.allManagers.add(manager);
	}
	
	public void removeManager(Employees manager) {
		this.allManagers.remove(manager);
	}
	
	@Override
	public void printDetails() {
		System.out.println("EmpID : " + empID + ", Emp Name : "+ empName + ", Position: General Manager");
	}
	
}
