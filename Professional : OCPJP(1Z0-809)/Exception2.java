class FuelNotAvailException extends Exception{};

class Vehicle {
	void ride() throws FuelNotAvailException {
		System.out.println("Happy Journey!");
	}
}

class SolarVehicle extends Vehicle {
	public void ride() throws FuelNotAvailException {
		super.ride();
	}
}


public class Exception2 {

	public static void main(String[] args) throws Exception {
		Vehicle v = new SolarVehicle();
		v.ride();

	}

}
