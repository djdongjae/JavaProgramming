package advanced_java.hw7_1;

//***************************
//파일명: Shape.java
//작성자: 201914089 오동재
//작성일: 2023-03-17
//내용: hw7_1
//***************************

public interface Shape {
	
	double PI = 3.14;
	
	void draw();
	void getArea();
	
	default void redraw() {
		System.out.println("--- 다시 그립니다.");
	}

}
