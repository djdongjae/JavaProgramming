package hansotbap.sec3;

import java.util.Scanner;

public class Boj_2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int result;
		for(int i=1; i<10; i++) {
			result = n*i;
			System.out.println(n + " * " + i + " = " + result);
		}
		
		input.close();

	}

}
