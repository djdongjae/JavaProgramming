package java_homework.hw11_1;

//***************************
//파일명: UsedCarTest.java
//작성자: 오동재
//작성일: 2022.11.04
//내용: UsedCar 클래스
//***************************

public class UsedCarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("201914089 오동재");
		
		Car car1 = new Car("blue", 2000000);//(1) Car 객체를 생성하되, 색상, 가격을 각각 "blue", 2000000로 초기화 하도록 생성한다.
		System.out.println("Car1 색상: " + car1.getColor());//(2) 위의 자동차 객체에게 물어보아 색상, 가격을 알아내어 출력한다.
		System.out.println("Car1 가격: " + car1.getPrice() + "\n");
		
		UsedCar car2 = new UsedCar( "red", 1000000, 2004);
		System.out.println("Car2 색상: " + car2.getColor());
		System.out.println("Car2 가격: " + car2.getPrice());
		System.out.println("Car2 생산년도: " + car2.getYear());
		

	}

}
