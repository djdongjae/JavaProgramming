package java_homework.practice.interface12.sec08;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] s = new Shape[2];
		s[0] = new Rectangle(2.0, 2.5);
		s[1] = new Circle(1.0);
		double a = s[0].area();
		double b = s[1].area();
		System.out.println(a);
		System.out.println(b);

	}

}
