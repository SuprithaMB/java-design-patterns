package main.java.com.supritha.learning.designpatterns.creational.factory;

public class WhatsAppNotification implements Notification {

	public void sendNotification(String msg) {
		System.out.println("Sending notification via whatsapp... and msg is : "+ msg);
	}

}
