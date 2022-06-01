package main.java.com.supritha.learning.designpatterns.creational.abstarctfactory;

public class CarFactory extends AbstractVehicleFactory {

	@Override
	public Vehicle getVehicle(VehicleType vehicleType) {

		if (VehicleType.MARUTHI.equals(vehicleType)) {
			return new MaruthiCar("maruthi-120", 600000, "red");
		} else if (VehicleType.DUSTER.equals(vehicleType)) {
			return new DusterCar("Duster-1", 800000, "black");
		}
		return new Vehicle() {

			@Override
			public void getSpecifications() {
				System.out.println("This brand car not available");

			}
		};
	}

}
