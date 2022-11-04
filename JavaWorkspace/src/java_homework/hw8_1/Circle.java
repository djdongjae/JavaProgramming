package java_homework.hw8_1;

//***************************
//파일명: Circle.java
//작성자: 오동재
//작성일: 2022.10.14
//내용: 원을 나타내는 Circle 클래스를 정의하고 이를 이용하는 프로그램을 작성하시오.
//**************************
public class Circle {
	private double radius;
	private double x;
	private double y;

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = (radius > 0) ? radius: 1.0;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double area() {
		double area = radius*radius*3.14;
		return area;
	}
	
	public void move(double dis_x, double dis_y) {
		x += dis_x;
		y += dis_y;
	}

}