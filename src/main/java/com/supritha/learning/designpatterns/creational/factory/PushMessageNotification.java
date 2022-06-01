package main.java.com.supritha.learning.designpatterns.creational.factory;

public class PushMessageNotification implements Notification{

	public void sendNotification(String msg) {
		System.out.println( "Sending PUSH message notification and msg is : "+ msg );
	}

}
