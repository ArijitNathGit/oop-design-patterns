package com.arijit.designpattern.singleton;

/**
 * Advantages :
 * 
 * The instance will be created only once even in multithreaded situation
 * 
 * Disadvantage:
 * 
 * Creates the instance even before it’s being used and that is not the best practice to use
 * 
 * */

public class EagerSingleton {

	public static void main(String[] args) {
		System.out.println(EagerSingletonImpl.getInstance());
		System.out.println(EagerSingletonImpl.getInstance());
		System.out.println(EagerSingletonImpl.getInstance());
		System.out.println(EagerSingletonImpl.getInstance());
	}

}

class EagerSingletonImpl {
	private static final EagerSingletonImpl INSTANCE = new EagerSingletonImpl();
	
	private EagerSingletonImpl() {}
	
	public static EagerSingletonImpl getInstance() {
		return INSTANCE;
	}
}