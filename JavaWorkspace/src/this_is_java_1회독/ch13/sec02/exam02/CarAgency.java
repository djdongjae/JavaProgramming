package this_is_java_1회독.ch13.sec02.exam02;

public class CarAgency implements Rentable<Car> {
	@Override
	public Car rent() {
		return new Car();
	}
}