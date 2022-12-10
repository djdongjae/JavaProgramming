package java_homework.practice.interface12.hw12_1;
/*
- Animal 추상클래스
속성: 이름
메소드: 
   이름을 매개변수로 받아 초기화하는 생성자
   이름에 대한 getter
   sound - 어떤 소리를 내는지를 출력하는 메소드로서, 추상메소드
   newYear - 한 해가 지날 때 해야할 일을 정의한 메소드로서, 추상메소드
   toString 오버라이드 
 */

abstract class Animal {
	private String name;
	public Animal(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public abstract String sound();
	public abstract void newYear();
	@Override
	public String toString() {
		return String.format("Animal (name = %s)", name);
	}
}