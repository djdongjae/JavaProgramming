package java_homework.hw11_1;

//***************************
//파일명: Car.java
//작성자: 오동재
//작성일: 2022.11.04
//내용: UsedCar 클래스
//***************************

public class Car {
	private String color;//색상
	private int price;//가격
	
	public Car(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getPrice() {
		return price;
	}

}
