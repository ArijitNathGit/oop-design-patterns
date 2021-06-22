package com.arijit.designpattern.singleton;

/**
 * Advantages :
 * 
 * The instance will be created only once even in multithreaded situation
 * 
 * Disadvantage:
 * 
 * Creates the instance even before it’s being used and that is not the best practice to use
 * Try Catch in the object creation will be a challenge
 * 
 * */
public class StaticBlockSingleton {

	public static void main(String[] args) {
		System.out.println(StaticBlockSingletonImpl.getInstance());
		System.out.println(StaticBlockSingletonImpl.getInstance());
		System.out.println(StaticBlockSingletonImpl.getInstance());
		System.out.println(StaticBlockSingletonImpl.getInstance());
	}

}

class StaticBlockSingletonImpl {
	private static final StaticBlockSingletonImpl INSTANCE;
	
	static {
		INSTANCE = new StaticBlockSingletonImpl();
	}
	
	private StaticBlockSingletonImpl() {}
	
	public static StaticBlockSingletonImpl getInstance() {
		return INSTANCE;
	}
}