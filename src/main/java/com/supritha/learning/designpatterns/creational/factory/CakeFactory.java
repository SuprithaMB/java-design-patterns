package main.java.com.supritha.learning.designpatterns.creational.factory;

public class CakeFactory {
	
	public Cake getCake(String cakeType) {
		
		if(cakeType == null) {
			return null;
		} 
		if(cakeType.equalsIgnoreCase("friut")) {
			return new FruitCake();
		} else if(cakeType.equalsIgnoreCase("pound")) {
			return new PoundCake();
		} else if(cakeType.equalsIgnoreCase("layer")) {
			return  new LayerCake();
		} else {
			return new PlainCake();
		}

		
	}

}
