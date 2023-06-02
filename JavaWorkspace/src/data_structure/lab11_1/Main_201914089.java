package data_structure.lab11_1;

import java.util.Scanner;

public class Main_201914089 {
	public static void main(String[] args) {
		System.out.println("lab11_1:오동재");
		System.out.println("정렬 알고리즘 insertion sort");

		// (1) 사용자가 원하는 갯수의 양의 정수를 입력받음
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		// (2) 배열 원소들을 정렬
		insertionSort(array);

		// (3) 정렬 결과 출력
		
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		
		scanner.close();
	}

	// 배열 원소들을 오름차순 삽입 정렬
	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int item = array[i];
			int j;
			for (j = i; (j > 0) && (array[j-1] > item); j--) {
				array[j] = array[j-1];
			}
			array[j] = item;
		}
	}
}
