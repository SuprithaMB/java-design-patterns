package main.java.com.supritha.learning.designpatterns.creational.abstarctfactory;

public class MahindraTractor extends Vehicle {

	private String name;
	private Integer price;
	private String color;
	private Integer capacity;

	public MahindraTractor(String name, Integer price, String color, Integer capacity) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.capacity = capacity;
	}

	@Override
	public void getSpecifications() {

		System.out.println("Mahindra Tractor name: " + name + " price : " + price + " color : " + color + "capacity : "
				+ capacity + " HP");

	}

}
