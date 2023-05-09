package hansotbap.week05.exam04;

public class Driver {
	
	public static void main(String[] args) {
		Car c1 = new Car("a", "v");
		System.out.println("자동차 1대 생산, 누적 생산량=" + Car.getNumberOfCars());
		
		Car c2 = new Car("a", "v");
		System.out.println("자동차 1대 생산, 누적 생산량=" + Car.getNumberOfCars());
		
		Car c3 = new Car("a", "v");
		System.out.println("자동차 1대 생산, 누적 생산량=" + Car.getNumberOfCars());
	}

}
