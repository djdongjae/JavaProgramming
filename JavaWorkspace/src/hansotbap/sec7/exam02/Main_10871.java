package hansotbap.sec7.exam02;

import java.util.Scanner;

public class Main_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int x = input.nextInt();
		
		int[] array = new int[n];
		
		for(int i=0; i<n; i++) {
			array[i] = input.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(array[i] < x) {
				System.out.print(array[i] +" ");
			}
		}

	}

}
