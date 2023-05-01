package hansotbap.week04.exam01;

public class Rocket {
	
	private int x, y;
	
	public Rocket(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x +" y=" + y;
	}
	
	public void moveUp() {
		y++;
	}

}
