package com.supritha.learning.designpatterns.creational.abstarctfactory;

public class TractorFactory extends AbstractVehicleFactory {

	@Override
	public Vehicle getVehicle(VehicleType vehicleType) {

		if (VehicleType.MAHINDRA.equals(vehicleType)) {
			return new MahindraTractor("mahindra-415", 680000, "red", 39);
		} else if (VehicleType.SWARAJ.equals(vehicleType)) {
			return new SwarajTractor("Swaraj-472", 540000, "black", 39);
		}

		return new Vehicle() {

			@Override
			public void getSpecifications() {
				System.out.println("This brand tractor not available");

			}
		};
	}

}
