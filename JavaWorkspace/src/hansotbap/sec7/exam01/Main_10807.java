package hansotbap.sec7.exam01;

import java.util.Scanner;

public class Main_10807 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] array = new int[n];
		
		for(int i=0; i<n; i++) {
			array[i] = input.nextInt();
		}
		
		int target = input.nextInt();
		
		int count = 0;
		for(int i=0; i<n; i++) {
			if(array[i] == target) {
				count++;
			}
		}
		System.out.println(count);

	}

}
