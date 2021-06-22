package com.arijit.designpattern.singleton;

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