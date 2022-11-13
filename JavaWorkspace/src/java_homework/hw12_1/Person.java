package java_homework.hw12_1;

//***************************
//파일명: Person.java
//작성자: 오동재
//작성일: 2022.11.13
//내용: Animal 추상 클래스
//***************************

public class Person extends Animal{
	
	private int age;
	
	public Person(String name, int age) {
		super(name);
		this.age = age;
	}
	
	public void newYear() {
		age += 1;
	}
	
	public String sound() {
		return "안녕 " + getName();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s세", getName(), age);
	}

}
