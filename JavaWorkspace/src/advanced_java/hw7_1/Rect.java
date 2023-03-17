package advanced_java.hw7_1;

//***************************
//파일명: Rect.java
//작성자: 201914089 오동재
//작성일: 2023-03-17
//내용: hw7_1
//***************************

public class Rect implements Shape {
	
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void getArea() {
		double area = width * height;
		System.out.println("면적은 " + area);
	}
	
	@Override
	public void draw() {
	
	}
	
	@Override
	public void redraw() {
		System.out.println("--- 다시 그립니다. " + width + "X" + height + "크기의 사각형입니다.");
	}

}
