package java_homework.practice.interface12.sec07;

public class Rectangle extends Shape {
	private double width, height;
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	public double area() {
		return width * height;
	}

}
