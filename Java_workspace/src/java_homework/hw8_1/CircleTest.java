package java_homework.hw8_1;

//***************************
//파일명: CircleTest.java
//작성자: 오동재
//작성일: 2022.10.14
//내용: 원을 나타내는 Circle 클래스를 정의하고 이를 이용하는 프로그램을 작성하시오.
//**************************
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[hw8_1] Circle 클래스 / 2019140898 오동재 \n");
		
		//(1) 원 객체를 두개 생성(circle1, circle2라고 부르자)
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		
		//(2) circle1의 반지름을 1.2, 좌표를 (3, 4)로 설정
		circle1.setRadius(1.2);
		circle1.setX(3);
		circle1.setY(4);
		
		//(3) circle2의 반지름을 -1.2, 좌표를 (-3, -4)로 설정
		circle2.setRadius(-1.2);
		circle2.setX(-3);
		circle2.setY(-4);
		
		//(4) circle1을 x축으로 10, y축으로 20만큼 이동
		circle1.move(10, 20);
		
		//(5) circle2도 x축으로 10, y축으로 20만큼 이동
		circle2.move(10, 20);
		
		//(6) circle1, circle2 에게 각자의 현재 x, y좌표와 면적을 물어보아 알아내어 출력
		System.out.println("circle1 x: " + circle1.getX());
		System.out.println("circle1 y: " + circle1.getY());
		System.out.println("circle1 radius: " + circle1.getRadius());
		System.out.println("");
		System.out.println("circle2 x: " + circle2.getX());
		System.out.println("circle2 y: " + circle2.getY());
		System.out.println("circle2 radius: " + circle2.getRadius());

	}

}