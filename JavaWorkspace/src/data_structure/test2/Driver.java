package data_structure.test2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("상자 용량: ");
		int box = input.nextInt();
		System.out.print("입력받을 사과의 개수: ");
		int apple = input.nextInt();
		
		int result = apple / box;
		System.out.println("필요한 상자의 개수: " + result);
		int remain = apple % box;
		System.out.println("남는 사과 개수: " + remain);

	}

}
