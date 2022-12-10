package java_homework.practice.interface12.hw12_1;

public class Person extends Animal {
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
