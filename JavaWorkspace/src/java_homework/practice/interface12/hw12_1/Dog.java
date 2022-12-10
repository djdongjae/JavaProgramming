package java_homework.practice.interface12.hw12_1;
/*
- Dog 클래스
Animal을 상속
속성: 속도(실수형)
메소드: 
   이름, 속도를 매개변수로 받아 초기화하는 생성자
   toString 오버라이드
   기타 필요한 메소드들
 */

public class Dog extends Animal {
	private double speed;
	public Dog(String name, double speed) {
		super(name);
		this.speed = speed;
	}
	public String sound() {
		return "멍멍 " + getName();
	}
	public void newYear() {
		speed += 5;
	}
	@Override
	public String toString() {
		return getName() + " 시속" + speed + "km";
	}
}
