package hansotbap.week05.exam05;

public class Circle {
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public Circle(int radius) {
		this.radius = radius;
		radius++;
	}
	

}
