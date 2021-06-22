package com.arijit.designpattern.creational.singleton;

/**
 * Advantages :
 * 
 * The instance will be created only when it is required. 
 * It works best in Single Threaded Environment
 * 
 * Disadvantage:
 * 
 * It can cause issues if multiple threads are inside the if condition at the same time. 
 * It will destroy the singleton pattern and both threads will get the different instances of the singleton class
 * 
 * */

public class LazySingleton {

	public static void main(String[] args) {
		System.out.println(LazySingletonImpl.getInstance());
		System.out.println(LazySingletonImpl.getInstance());
		System.out.println(LazySingletonImpl.getInstance());
		System.out.println(LazySingletonImpl.getInstance());
	}

}

class LazySingletonImpl {
	private static LazySingletonImpl instance;
	
	private LazySingletonImpl() {}
	
	public static LazySingletonImpl getInstance() {
		if( instance == null ) {
			instance = new LazySingletonImpl();
		}
		
		return instance;
	}
}