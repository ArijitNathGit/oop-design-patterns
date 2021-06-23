package com.arijit.designpattern.structural.composite;

/**
 * Its a partitioning design pattern which describes a group of objects that is treated the same way as a single instance of the same type of object.
 * According to GoF : "Compose objects into a tree structure to represent part-whole hierarchy".
 * 
 * When to use?
 * 
 * Composite Pattern should be used when clients need to ignore the difference between compositions of objects and individual objects. 
 * If programmers find that they are using multiple objects in the same way, and often have nearly identical code to handle each of them, 
 * then composite is a good choice, it is less complex in this situation to treat primitives and composites as homogeneous.
 * 
 * Less number of objects reduces the memory usage, and it manages to keep us away from errors related to memory like java.lang.OutOfMemoryError.
 * 
 * Although creating an object in Java is really fast, we can still reduce the execution time of our program by sharing objects.
 * 
 * 
 * When not to use?
 * 
 * Composite DP can make design overly general
 * 
 * 
 * Our Example:
 * 	GM: General Manager
 *  M: Manager
 *  D: Developers
 * 
 * 					GM
 * 				M    M    M
 *            D  D  D D  D D			
 * 
 * 
 * */

public class CompositeDesignPattern {

	public static void main(String[] args) {
		GeneralManager gm = new GeneralManager(1, "Arijit");
		
		Managers manager1 = new Managers(2, "Ari");
		Managers manager2 = new Managers(3, "S");
		Managers manager3 = new Managers(4, "T");
		
		Employees developer1 = new Developers(5, "Q");
		Employees developer2 = new Developers(6, "W");
		Employees developer3 = new Developers(7, "E");
		Employees developer4 = new Developers(8, "R");
		Employees developer5 = new Developers(9, "T");
		Employees developer6 = new Developers(10, "Y");
		
		gm.addManager(manager1);
		gm.addManager(manager2);
		gm.addManager(manager3);
		
		manager1.addDeveloper(developer1);
		manager1.addDeveloper(developer2);
		
		manager2.addDeveloper(developer3);
		manager2.addDeveloper(developer4);
		
		manager3.addDeveloper(developer5);
		manager3.addDeveloper(developer6);
		
		gm.printDetails();
		gm.showManagers();
		manager1.showDevelopers();
		manager2.showDevelopers();
		manager3.showDevelopers();
	}

}
