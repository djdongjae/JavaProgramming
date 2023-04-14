package advanced_java.hw11_1;

//***************************
//파일명: CollectionTest.java
//작성자: 201914089 오동재
//작성일: 2023-04-13
//내용: hw11_1
//***************************

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw11_1 오동재");
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		
		int score = 0;
		
		while(true) {
			System.out.print("점수를 입력하세요: ");
			score = input.nextInt();
			if(score >=0 ) {
				scores.add(score);
			} else {
				break;
			}
		}
		
		int length = scores.size();
		System.out.println("전체 학생은 " + length + "이다.");
		
		System.out.print("학생들의 성적: ");
		scores.forEach((e) -> {
			System.out.print(e + " ");
		});
		System.out.println();
		int max = Collections.max(scores);
		int a = max - 10;
		int b = max - 20;
		int c = max - 30;
		
		for(int i=0; i<length; i++) {
			if(scores.get(i) >= a) {
				System.out.println(i + "번 학생의 성적은 " + scores.get(i) + "이며 등급은 A이다");
			} else if(scores.get(i) >= b && scores.get(i) < a) {
				System.out.println(i + "번 학생의 성적은 " + scores.get(i) + "이며 등급은 B이다");
			} else if(scores.get(i) >= c && scores.get(i) < b) {
				System.out.println(i + "번 학생의 성적은 " + scores.get(i) + "이며 등급은 C이다");
			} else {
				System.out.println(i + "번 학생의 성적은 " + scores.get(i) + "이며 등급은 F이다");
			}
		}
		
		input.close();
		
	}

}
