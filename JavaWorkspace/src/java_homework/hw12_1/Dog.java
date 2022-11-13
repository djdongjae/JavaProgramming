package java_homework.hw12_1;

//***************************
//파일명: Dog.java
//작성자: 오동재
//작성일: 2022.11.13
//내용: Animal 추상 클래스
//***************************

public class Dog extends Animal {

	private double speed;
	
	public Dog(String name, double speed) {
		super(name);
		this.speed = speed;
	}
	
	public void newYear() {
		speed += 5;
	}
	
	public String sound() {
		return "멍멍 " + getName();
	}
	
	@Override
	public String toString() {
		return String.format("%s 시속%skm", getName(), speed);
	}

}
