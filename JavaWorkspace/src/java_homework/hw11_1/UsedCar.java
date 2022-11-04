package java_homework.hw11_1;


//***************************
//파일명: UsedCar.java
//작성자: 오동재
//작성일: 2022.11.04
//내용: UsedCar 클래스
//***************************

public class UsedCar extends Car{
	private int year;

	public UsedCar(String color, int price, int year) {
		super(color, price);
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
}
