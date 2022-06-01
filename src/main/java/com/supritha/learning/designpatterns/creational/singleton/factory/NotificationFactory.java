package com.supritha.learning.designpatterns.creational.factory;

public class NotificationFactory {

	public Notification getNotificationService(String notificationType) {
		if (notificationType == null) {
			return null;
		}

		if (notificationType.equalsIgnoreCase("whatsapp")) {
			return new WhatsAppNotification();
		} else if (notificationType.equalsIgnoreCase("facebook")) {
			return new FacebookNotification();
		} else if (notificationType.equalsIgnoreCase("email")) {
			return new EmailNotification();
		} else {
			return new PushMessageNotification();
		}
	}
}
