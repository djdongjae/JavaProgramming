package java_homework.hw9_1;

//***************************
//파일명: Television.java
//작성자: 오동재
//작성일: 2022.11.03
//내용: Television 생성자, 정적변수/메소드
//**************************

public class Television {
	private String model;
	private int price;
	
	static int numberOfTVs = 0;
	
	public void set_model(String model) {
		this.model = model;
	}
	
	public String get_model() {
		return model;
	}
	
	public void set_price(int price) {
		this.price = price;
	}
	
	public int get_price() {
		return price;
	}
	
	public Television() {
		model = "MyTV";
		price = 0;
		Television.numberOfTVs += 1;
	}
	
	public Television(String model) {
		this.model = model;
		price = 0;
		Television.numberOfTVs += 1;
	}
	
	public Television(String model, int price) {
		this.model = model;
		this.price = price;
		Television.numberOfTVs += 1;
	}
	
	public String toString() {
		return "모델명: " + model + ", 가격: " + price;
	}

}
