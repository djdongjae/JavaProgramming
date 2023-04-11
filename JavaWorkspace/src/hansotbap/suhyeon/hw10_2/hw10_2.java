/*
파일명:hw10_2.java
작성자:201914009 김수현
작성일:4/6
내용: 람다식과 함수형 인터페이스 사용을 통한 곱셈출력
 */
package hansotbap.suhyeon.hw10_2;


import java.util.Scanner;

import java.util.function.BiFunction;



public class hw10_2 {

        public static void main(String[] args) {



            Scanner sc = new Scanner(System.in);

            int x;

            int y;
            System.out.println("hw10_2:김수현");

            BiFunction<Integer,Integer,Integer> m = (num1,num2)->num1*num2;
            System.out.print("첫 번쨰 정수 입력 : ");

            x = sc.nextInt();

            System.out.print("두 번쨰 정수 입력 : ");

            y = sc.nextInt();


            int result = m.apply(x,y);
            System.out.println(result);

        }
}