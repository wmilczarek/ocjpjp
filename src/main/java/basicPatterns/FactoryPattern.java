package basicPatterns;


public class FactoryPattern {
}

class CarSalon {

	private CarFactory carFactory;

	public CarSalon(CarFactory carFactory) {
		this.carFactory = carFactory;
	}

	public void provideCar() {
		Car car = carFactory.createCar("someCarType");
		//some Other code
	}


}

class CarFactory {

	public Car createCar(String typeOfCar) {
		return new Car(typeOfCar);
	}

}

class Car {

	private final String type;

	public Car(String typeOfCar) {
		this.type = typeOfCar;
	}
}
