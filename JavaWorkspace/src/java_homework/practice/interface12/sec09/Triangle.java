package java_homework.practice.interface12.sec09;

public class Triangle extends Shape {
	private double base, height;
	public Triangle(double b, double h) {
		base = b;
		height = h;
	}
	
	public double area() {
		return base * height/2.0;
	}
}
