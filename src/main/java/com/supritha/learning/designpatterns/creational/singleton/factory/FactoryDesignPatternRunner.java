package com.supritha.learning.designpatterns.creational.factory;

/*
 ----------------------------------------------------------------------------------------
    Factory Design Pattern
 ----------------------------------------------------------------------------------------
 
 1. Factory Design pattern is one of the most used design patterns in Java.
 2. Factory Design Pattern comes under Creational design pattern.
 3. In Factory pattern, we create object without exposing the creation logic to the client 
	and refer to newly created object using a common interface.
	
-----------------------------------------------------------------------------------------
Implementation of Factory Design Pattern
-----------------------------------------------------------------------------------------

1. Define a factory method inside an interface. 
2. Let the subclass implements the above factory method and decide which object to create. 

In Java constructors are not polymorphic, but by allowing subclass to create an object, 
we are adding polymorphic behavior to the instantiation. 
In short, we are trying to achieve Pseudo polymorphism by letting the subclass to decide 
what to create, and so this Factory method is also called as Virtual constructor


-----------------------------------------------------------------------------------------
Advantages Of Factory design pattern
-----------------------------------------------------------------------------------------
1. Loose Coupling and Segregation of Responsibilities

-----------------------------------------------------------------------------------------
	
 */


public class FactoryDesignPatternRunner {

	public static void main(String[] args) {
		
		//Example 1 //
		/**
		 * Consider we want to implement a cake factory service using different cakes available. 
		 * 
		 */
		
		System.out.println("Demo of example - 1" + "\n"); 
		
		CakeFactory  cakeFactory = new CakeFactory();
		
		Cake  friutCake = cakeFactory.getCake("friut");
		friutCake.getCakeDescription();
		
		Cake  layeredCake = cakeFactory.getCake("layer");
		layeredCake.getCakeDescription();
		
		Cake  poundCake = cakeFactory.getCake("pound");
		poundCake.getCakeDescription();
		
		Cake plainCake = cakeFactory.getCake("");
		plainCake.getCakeDescription();
		
		System.out.println();
		
		/*Example 2 
		 *  Consider we want to implement a notification service using different message services available. 
		 */
		System.out.println("Demo of example - 2"  + "\n");
		
		String msg = "Demo of factory design pattern";
		NotificationFactory notificationFactory = new NotificationFactory();
		
		Notification  whatsAppNotificaton = notificationFactory.getNotificationService("whatsapp");
		whatsAppNotificaton.sendNotification(msg);
		
		Notification  facebookNotificaton = notificationFactory.getNotificationService("facebook");
		facebookNotificaton.sendNotification(msg);
		
		Notification  emailNotificaton = notificationFactory.getNotificationService("email");
		emailNotificaton.sendNotification(msg);
		
		Notification  pushMsgNotificaton = notificationFactory.getNotificationService("push");
		pushMsgNotificaton.sendNotification(msg);
		
		
		
	}

}

/** ------------------------------ OUTPUT -----------------------------------------------------------
	Demo of example - 1

Fruit cake is a heavy spiced cake containing nuts, candied or dried fruits, and often rum or brandy.
Layer cake is of two or more layers with jam, cream, or icing between.
Pound cake is a type of cake traditionally made with a pound of each of four ingredients:  flour, butter, eggs, and sugar. Pound cakes are generally baked in either a loaf pan or a Bundt mold. They are sometimes served either dusted with powdered sugar, lightly glazed, or with a coat of icing
Plain cake is made without cream or butter or ice.  we can keep plain cake more days compared to other other cakes

Demo of example - 2

Sending notification via whatsapp... and msg is : Demo of factory design pattern
Sending notification using facebook and msg is : Demo of factory design pattern
Sending EMAIL notification and msg is : Demo of factory design pattern
Sending PUSH message notification and msg is : Demo of factory design pattern

 **/
