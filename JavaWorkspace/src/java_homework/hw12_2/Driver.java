package java_homework.hw12_2;

//***************************
//파일명: Driver.java
//작성자: 오동재
//작성일: 2022.11.14
//내용: anonymous class
//***************************

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("201914089 오동재\n");
		
		Speakable dog = new Speakable() {
			@Override
			public void speak() {
				System.out.println("멍멍");
			}
		};
		
		Speakable alarm = new Speakable() {
			private int number=5;
			
			@Override
			public void speak() {
				for(int i=0;i<number;i++)
					System.out.println("삐");
				System.out.println();
				number += 3;
			}
		};
		
		dog.speak();
		alarm.speak();
		alarm.speak();

	}

}
