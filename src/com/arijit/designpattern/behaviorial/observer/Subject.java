package com.arijit.designpattern.behaviorial.observer;

public interface Subject {
	void register(Observer obj);
	void unregister(Observer obj);
	void notifyObserver();
	public String getUpdate();
}
