package hansotbap.week05.exam04;

public class Car {
	private String model;
	private String maker;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	private static int numberOfCars = 0;

	public Car(String model, String maker) {
		this.model = model;
		this.maker = maker;
		numberOfCars++;
	}
	
	public static int getNumberOfCars() {
		return numberOfCars;
	}
}
