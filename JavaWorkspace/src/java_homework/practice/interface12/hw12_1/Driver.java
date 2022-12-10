package java_homework.practice.interface12.hw12_1;

//***************************
//파일명: Driver.java
//작성자: 오동재
//작성일: 2022.11.13
//내용: Animal 추상 클래스
//***************************

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("201914089 오동재\n");
		
		//(1)
		Animal[] arrayOfAnimal = new Animal[4];
		arrayOfAnimal[0] = new Dog("진돌이", 13.5);
		arrayOfAnimal[1] = new Dog("진순이", 12.5);
		arrayOfAnimal[2] = new Person("홍길동", 20);
		arrayOfAnimal[3] = new Person("박길동", 25);
		
		//(2)
		for (int i=0;i<arrayOfAnimal.length;i++) {
			System.out.println(arrayOfAnimal[i].toString());
		}
		
		//(3)
		for (int i=0;i<arrayOfAnimal.length;i++) {
			System.out.println(arrayOfAnimal[i].sound());
		}
		
		System.out.println("------------1년후------------");
		
		//(4)
		for (int i=0;i<arrayOfAnimal.length;i++) {
			arrayOfAnimal[i].newYear();
		}
		
		//(5)
		for (int i=0;i<arrayOfAnimal.length;i++) {
			System.out.println(arrayOfAnimal[i].toString());
		}
		
		System.out.println("------------2년후------------");
		
		//(6)
		for (int i=0;i<arrayOfAnimal.length;i++) {
			arrayOfAnimal[i].newYear();
		}
		
		//(7)
		for (int i=0;i<arrayOfAnimal.length;i++) {
			System.out.println(arrayOfAnimal[i].toString());
		}

	}

}
