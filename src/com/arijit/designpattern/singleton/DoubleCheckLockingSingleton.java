package com.arijit.designpattern.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Advantages :
 * 
 * The instance will be created only when it is required. 
 * It works best in MultiThreaded Environment
 * 
 * Disadvantage:
 * 
 * It will reduce the performance because cost associated with the synchronization method.
 * Although we need it only for the first few threads who might create the separate instances
 * 
 * */

public class DoubleCheckLockingSingleton {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		Runnable task1 = () -> { System.out.println(DoubleCheckLockingSingletonImpl.getInstance()); };
		Runnable task2 = () -> { System.out.println(DoubleCheckLockingSingletonImpl.getInstance());	};		
		Runnable task3 = () -> { System.out.println(DoubleCheckLockingSingletonImpl.getInstance()); };		
		Runnable task4 = () -> { System.out.println(DoubleCheckLockingSingletonImpl.getInstance());	};
		
		executor.submit(task1);
		executor.submit(task2);
		executor.submit(task3);
		executor.submit(task4);
		
		executor.shutdown();
		executor.awaitTermination(2, TimeUnit.SECONDS);
	}

}

class DoubleCheckLockingSingletonImpl {
	private static DoubleCheckLockingSingletonImpl instance;
	
	private DoubleCheckLockingSingletonImpl() {}
	
	public static DoubleCheckLockingSingletonImpl getInstance() {
		if( instance == null ) {
			synchronized (DoubleCheckLockingSingletonImpl.class) {
				if( instance == null ) {
					instance = new DoubleCheckLockingSingletonImpl();
				}
			}
		}
		
		return instance;
	}
}