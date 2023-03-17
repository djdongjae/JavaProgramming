package advanced_java.hw7_1;

//***************************
//파일명: ShapeDriver.java
//작성자: 201914089 오동재
//작성일: 2023-03-17
//내용: hw7_1
//***************************

public class ShapeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_1: 오동재");
		
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(20);
		Rect r1 = new Rect(10, 40);
		Rect r2 = new Rect(20, 40);
		
		Shape[] shapes = {c1, c2, r1, r2};
		
		for(Shape s : shapes) {
			s.redraw();
		}
		
		for(Shape s : shapes) {
			s.getArea();
		}

	}

}
