package data_structure.lab5_1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main_201914089 {
	public static void main(String[] args) {
		System.out.println("lab5_1:오동재");

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();

		// 단어를 저장할 ArrayList형 리스트 객체 list를 생성하되, 초기 용량을 5로 함
		ArrayList<String> list = new ArrayList<String>(n*2);
		System.out.println(list);
		
		for(int i=0; i<n; i++) {
			String word = input.next();
			list.add(word);
		}
		
		System.out.println(list);

		// 사용자로부터 두개의 단어를 입력받아 list에 삽입
		String x = input.next();
		if(list.contains(x)) {
			list.remove(x);
			System.out.println(list);
		}else {
			list.add(x);
			System.out.println(list);
		}
		
		String y = input.next();
		if(list.contains(y)) {
			list.remove(y);
			System.out.println(list);
		}else {
			list.add(y);
			System.out.println(list);
		}
		
		input.close();
	}
}
