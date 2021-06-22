package com.arijit.designpattern.singleton;

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