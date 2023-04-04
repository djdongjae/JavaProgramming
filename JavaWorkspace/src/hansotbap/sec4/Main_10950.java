package hansotbap.sec4;

import java.util.Scanner;

public class Main_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		int[] array = new int[t];
		
		int a, b;
		for(int i=0; i<t; i++) {
			a = input.nextInt();
			b = input.nextInt();
			array[i] = a + b;
		}
		for(int i=0; i<t; i++) {
			System.out.println(array[i]);
		}

	}

}
