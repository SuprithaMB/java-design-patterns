package main.java.com.supritha.learning.designpatterns.creational.factory;

public class EmailNotification implements Notification {

	public void sendNotification(String msg) {
		
		System.out.println("Sending EMAIL notification and msg is : "+ msg);
		
	}

}
