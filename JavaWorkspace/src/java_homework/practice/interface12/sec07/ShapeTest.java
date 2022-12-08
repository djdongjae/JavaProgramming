package java_homework.practice.interface12.sec07;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape1 = new Rectangle(2.0, 2.5);
		Shape shape2 = new Circle(1.0);
		
		double a = shape1.area();
		double b = shape2.area();
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);

	}

}
