package advanced_java.hw7_1;

//***************************
//파일명: Circle.java
//작성자: 201914089 오동재
//작성일: 2023-03-17
//내용: hw7_1
//***************************

public class Circle implements Shape {
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void getArea() {
		double area = PI * radius * radius;
		System.out.println("면적은 " + area);
	}

	@Override
	public void draw() {
	}
	
	@Override
	public void redraw() {
		System.out.println("--- 다시 그립니다. " + "반지름이 " + radius + "인 원입니다.");
	}
	
	
}
