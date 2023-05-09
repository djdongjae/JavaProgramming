package hansotbap.week05.exam02;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle(10, 10, 5);
		System.out.println(c + "\n");
		c.move(10, 20);
		System.out.println("move() 호출 후");
		System.out.println(c);

	}

}
