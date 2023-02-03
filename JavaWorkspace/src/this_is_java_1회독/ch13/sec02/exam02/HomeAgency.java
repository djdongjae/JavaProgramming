package this_is_java_1회독.ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home> {
	@Override
	public Home rent() {
		return new Home();
	}
}
