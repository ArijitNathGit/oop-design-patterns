package com.arijit.designpattern.behaviorial.observer;

public class MyTopicSubscriber implements Observer {

	private String name;
	private Subject topic;
	
	public MyTopicSubscriber(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		String message = this.topic.getUpdate();
		if("".equals(message)) {
			System.out.println("No new Messages!");
		}
		else {
			System.out.println(name + " Consuming Message : " + message);
		}
		
	}

	@Override
	public void setSubject(Subject sub) {
		this.topic = sub;		
	}

}
