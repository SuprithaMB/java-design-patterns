package com.supritha.learning.designpatterns.creational.abstarctfactory;

public class SwarajTractor extends Vehicle {

	private String name;
	private Integer price;
	private String color;
	private Integer capacity;

	public SwarajTractor(String name, Integer price, String color, Integer capacity) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.capacity = capacity;
	}

	@Override
	public void getSpecifications() {

		System.out.println("Swaraj Tractor name : " + name + " price : " + price + " color : " + color + " capacity : "
				+ capacity + " HP");

	}

}
