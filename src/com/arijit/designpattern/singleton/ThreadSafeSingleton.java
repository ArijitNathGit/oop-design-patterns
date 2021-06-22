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

public class ThreadSafeSingleton {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		Runnable task1 = () -> { System.out.println(ThreadSafeSingletonImpl.getInstance()); };
		Runnable task2 = () -> { System.out.println(ThreadSafeSingletonImpl.getInstance());	};		
		Runnable task3 = () -> { System.out.println(ThreadSafeSingletonImpl.getInstance()); };		
		Runnable task4 = () -> { System.out.println(ThreadSafeSingletonImpl.getInstance());	};
		
		executor.submit(task1);
		executor.submit(task2);
		executor.submit(task3);
		executor.submit(task4);
		
		executor.shutdown();
		executor.awaitTermination(2, TimeUnit.SECONDS);
	}

}

class ThreadSafeSingletonImpl {
	private static ThreadSafeSingletonImpl instance;
	
	private ThreadSafeSingletonImpl() {}
	
	public static ThreadSafeSingletonImpl getInstance() {
		synchronized (ThreadSafeSingletonImpl.class) {
			if( instance == null ) {
				instance = new ThreadSafeSingletonImpl();
			}
		}
		
		return instance;
	}
}