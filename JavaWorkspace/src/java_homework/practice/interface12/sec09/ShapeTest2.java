package java_homework.practice.interface12.sec09;

public class ShapeTest2 {
	private static Shape[] arrayOfShapes;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		System.out.println(allArea());
	}
	
	private static void init() {
		arrayOfShapes = new Shape[4];
		arrayOfShapes[0] = new Rectangle(2.0, 2.5);
		arrayOfShapes[1] = new Rectangle(4.2, 2.0);
		arrayOfShapes[2] = new Circle(1.0);
		arrayOfShapes[3] = new Triangle(2.0, 3.5);
	}
	
	private static double allArea() {
		double sum = 0.0;
		for (int i=0; i<arrayOfShapes.length; i++) {
			sum += arrayOfShapes[i].area();
		}
		return sum;
	}

}
