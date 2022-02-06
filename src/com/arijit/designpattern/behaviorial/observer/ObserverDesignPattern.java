package com.arijit.designpattern.behaviorial.observer;

public class ObserverDesignPattern {
	public static void main(String[] args) {
		MyTopicSubject topicSubject = new MyTopicSubject();
		
		Observer ob1 = new MyTopicSubscriber("Obs1");
		Observer ob2 = new MyTopicSubscriber("Obs2");
		Observer ob3 = new MyTopicSubscriber("Obs3");
		
		topicSubject.register(ob1);
		topicSubject.register(ob2);
		topicSubject.register(ob3);
		
		/*
		 * ob1.setSubject(topicSubject); ob2.setSubject(topicSubject);
		 * ob3.setSubject(topicSubject);
		 */
		
		topicSubject.postMessage("Arijit");
	}
}
