package com.supritha.learning.designpatterns.creational.factory;

public class FacebookNotification  implements Notification{

	public void sendNotification(String msg) {
		System.out.println("sSending notification using facebook and msg is : " + msg);
	}

}
