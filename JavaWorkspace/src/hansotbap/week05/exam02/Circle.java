package hansotbap.week05.exam02;

public class Circle {

	private int x, y;
	private int radius;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void move(int dx, int dy) {
		this.setX(x+dx);
		this.setY(y+dy);
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}

}
