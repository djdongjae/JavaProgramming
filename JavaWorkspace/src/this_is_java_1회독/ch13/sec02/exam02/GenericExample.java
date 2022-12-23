package this_is_java_1회독.ch13.sec02.exam02;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeAgency homeagency = new HomeAgency();
		Home home = homeagency.rent();
		home.turnOnLight();
		
		CarAgency caragency = new CarAgency();
		Car car = caragency.rent();
		car.run();

	}

}
