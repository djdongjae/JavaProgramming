package advanced_java.hw10_2;

//***************************
//파일명: LambdaTest.java
//작성자: 201914089 오동재
//작성일: 2023-04-06
//내용: hw10_2
//***************************


import java.util.Scanner;
import java.util.function.BiFunction;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x, y;
		
		BiFunction<Integer, Integer, Integer> m = (a, b) -> a*b;
		
		System.out.print("첫 번째 정수 입력: ");
		x = input.nextInt();
		System.out.print("두 번째 정수 입력: ");
		y = input.nextInt();
		
		int result = m.apply(x, y);
		System.out.println("결과: " + result);
		
		input.close();
	}

}
