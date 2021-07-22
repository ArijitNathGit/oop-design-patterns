package com.arijit.designpattern.behaviorial.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopicSubject implements Subject {
	
	private List<Observer> observers;
	private String message;
	
	public MyTopicSubject() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void register(Observer obj) {
		this.observers.add(obj);	
	}

	@Override
	public void unregister(Observer obj) {
		this.observers.remove(obj);
	}

	@Override
	public void notifyObserver() {
		for(Observer ob : observers) {
			ob.update();
		}		
	}

	@Override
	public String getUpdate() {
		return this.message;
	}
	
	public void postMessage(String message) {
		System.out.println("Message posted to topic: " + message);
		this.message = message;
		notifyObserver();
	}

}
