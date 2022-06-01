package main.java.com.supritha.learning.designpatterns.creational.abstarctfactory;

public class FactoryGenerator {

	public static AbstractVehicleFactory getFactory(FactoryType factoryType) {
		
		if(FactoryType.CAR_FACTORY.equals( factoryType)) {
			return new CarFactory();
		}else if(FactoryType.TRACTOR_FACTORY.equals(factoryType)) {
			return new TractorFactory();
		}
		return null;

	}

}
