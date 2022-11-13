package java_homework.hw12_1;

//***************************
//파일명: Animal.java
//작성자: 오동재
//작성일: 2022.11.13
//내용: Animal 추상 클래스
//***************************

public abstract class Animal {
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
