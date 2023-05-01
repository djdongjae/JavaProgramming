package hansotbap.week04.exam04;

public class Dog {
	
	private String name;
	public String breed;
	private int age;
	
	public String toString() {
		return String.format("Dog (name=%s, breed=%s, age=%s)", name, breed, age);
	}
	
	public Dog(String breed, int age, String name) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public Dog(String name, int age) {
		this("york", age, name);
	}
	
	public void barking() {
		System.out.println("멍멍");
	}

}
