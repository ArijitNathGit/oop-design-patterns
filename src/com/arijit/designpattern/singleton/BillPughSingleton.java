package com.arijit.designpattern.singleton;

/**
 * Advantages :
 * 
 * Faster as it does not require synchronization 
 * 
 * Disadvantage:
 * 
 * It can cause issues if multiple threads are inside the if condition at the same time. 
 * It will destroy the singleton pattern and both threads will get the different instances of the singleton class
 * 
 * */

public class BillPughSingleton {

	public static void main(String[] args) {
		System.out.println(BillPughSingletonImpl.getInstance());
		System.out.println(BillPughSingletonImpl.getInstance());
		System.out.println(BillPughSingletonImpl.getInstance());
		System.out.println(BillPughSingletonImpl.getInstance());
	}

}

class BillPughSingletonImpl {
	private BillPughSingletonImpl() {}
	
	public static BillPughSingletonImpl getInstance() {
		return BillPughSingletonImplHelper.INSTANCE;
	}
	
	private static class BillPughSingletonImplHelper {
		private static final BillPughSingletonImpl INSTANCE = new BillPughSingletonImpl();
	}
}