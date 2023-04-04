package hansotbap.sec6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a, b;
		int result;
		
		while(input.hasNext()) {
			a = input.nextInt();
			b = input.nextInt();
			result = a + b;
			
			System.out.println(result);
		}

	}

}
