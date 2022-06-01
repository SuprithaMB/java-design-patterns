package com.supritha.learning.designpatterns.creational.abstarctfactory;

public class MaruthiCar extends Vehicle {

	private String name;
	private Integer price;
	private String color;

	public MaruthiCar(String name, Integer price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	@Override
	public void getSpecifications() {

		System.out.println("Maruthi Car name : " + name + " price : " + price + " color : " + color);

	}

}
