package hansotbap.week03.sec07.exam03;

import java.util.Scanner;

public class Main_10810 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		int[] array = new int[n];
		
		int a, b, k;
		
		for(int i=0; i<m; i++) {
			a = input.nextInt();
			b = input.nextInt();
			k = input.nextInt();
			
			for(int j=a; j<=b; a++) {
				array[j] = k;
			}
			
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
