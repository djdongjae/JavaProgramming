package data_structure.lab3_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("lab3_2:오동재");
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		double[] array = new double[n];
		
		for(int i=0; i<n; i++) {
			array[i] = input.nextDouble();
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(array[i] + " ");
		}
		
		input.close();

	}

}
