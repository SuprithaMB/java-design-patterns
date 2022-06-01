package main.java.com.supritha.learning.designpatterns.creational.abstarctfactory;


/**
 * -----------------Definition----------------------------------------------------------------------------------------------------
 1. Abstract Factory Pattern says that just define an interface or abstract class for creating families of related (or dependent) 
    objects but without specifying their concrete sub-classes.That means Abstract Factory lets a class returns a factory of classes. 
    So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.
    An Abstract Factory Pattern is also known as Kit
 2. Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products.
 
--------------------Advantages-----------------------------------------------------------------------------------------------------

	1. Abstract Factory Pattern isolates the client code from concrete (implementation) classes.
	2. It eases the exchanging of object families.
	3. It promotes consistency among objects.
--------------------Usage of Abstract Factory Pattern-------------------------------------------------------------------------------

	1. When the system needs to be independent of how its object are created, composed, and represented.
	2. When the family of related objects has to be used together, then this constraint needs to be enforced.
	3. When you want to provide a library of objects that does not show implementations and only reveals interfaces.
	4. When the system needs to be configured with one of a multiple family of objects.	
	
--------------------Disadvantages---------------------------------------------------------------------------------------------------

 	1. Because of loose coupling by means of additional objects results in decreased performance.
-------------------------------------------------------------------------------------------------------------------------------------
 **/

public class AbstarctFactoryDesignPatternRunner {

	public static void main(String[] args) {
		
		System.out.println("\n----------------------- car factory ------------------------------\n");

		AbstractVehicleFactory carFactory = FactoryGenerator.getFactory(FactoryType.CAR_FACTORY);
		carFactory.getVehicle(VehicleType.MARUTHI).getSpecifications();
		carFactory.getVehicle(VehicleType.DUSTER).getSpecifications();
		carFactory.getVehicle(VehicleType.MAHINDRA).getSpecifications();
		
		System.out.println("\n----------------------- tractor Factory-------------------------------\n");
		
		AbstractVehicleFactory tractorFactory = FactoryGenerator.getFactory(FactoryType.TRACTOR_FACTORY);
		tractorFactory.getVehicle(VehicleType.MAHINDRA).getSpecifications();
		tractorFactory.getVehicle(VehicleType.SWARAJ).getSpecifications();
		tractorFactory.getVehicle(VehicleType.MARUTHI).getSpecifications();

	}

}

/**-----------------------  OUTPUT ------------------------------------------
* ----------------------- car factory ---------------------------------------

Maruthi Car name : maruthi-120 price : 600000 color : red
Duster Car name : Duster-1 price : 800000 color : black
This brand car not available

----------------------- tractor Factory---------------------------------------

Mahindra Tractor name: mahindra-415 price : 680000 color : red capacity : 39 HP
Swaraj Tractor name : Swaraj-472 price : 540000 color : black capacity : 39 HP
This brand tractor not available

**/