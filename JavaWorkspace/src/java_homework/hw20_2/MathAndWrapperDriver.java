package java_homework.hw20_2;

//***************************
//파일명: MathAndWrapperDriver.java
//작성자: 오동재
//작성일: 2022.11.22
//내용: [hw20_2] java.lang 패키지
//***************************

import java.util.Scanner;

public class MathAndWrapperDriver {

	public static void main(String[] args) {
		System.out.println("hw20_2: 201914089 오동재\n");
		
		//(1)
		double circle_area = 1.5 * 1.5 * Math.PI;
		System.out.println("반지름이 1.5인 원의 면적: " + circle_area);
		
		double pow = Math.pow(3, 10);
		System.out.println("3의 10승: " + pow);
		
		double sqrt = Math.sqrt(8);
		System.out.println("루트 8: " + sqrt);
		
		System.out.println();
		
		//(2)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호를 입력하시오(-포함): ");
		String ssn = sc.next();
		String[] array_ssn = ssn.split("-");
		
		System.out.println("앞자리 = " + array_ssn[0]);
		System.out.println("뒷자리 = " + array_ssn[1]);
		
		int front_ssn = Integer.parseInt(array_ssn[0]);
		int back_ssn = Integer.parseInt(array_ssn[1]);
		int sum_ssn = front_ssn+back_ssn;
		System.out.println("합 = " + sum_ssn);
		
	}

}
