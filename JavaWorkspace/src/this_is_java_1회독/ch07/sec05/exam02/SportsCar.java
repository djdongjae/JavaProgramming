package this_is_java_1회독.ch07.sec05.exam02;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//@Override
	//public void stop() {} 오버라이딩을 할 수 없음
}
