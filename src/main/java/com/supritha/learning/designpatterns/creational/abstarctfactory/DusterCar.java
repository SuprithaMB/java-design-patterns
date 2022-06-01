package main.java.com.supritha.learning.designpatterns.creational.abstarctfactory;

public class DusterCar extends Vehicle {

	private String name;
	private Integer price;
	private String color;

	public DusterCar(String name, Integer price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	@Override
	public void getSpecifications() {

		System.out.println("Duster Car name : " + name + " price : " + price + " color : " + color);

	}

}
