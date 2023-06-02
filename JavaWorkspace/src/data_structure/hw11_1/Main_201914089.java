package data_structure.hw11_1;

import java.util.Scanner;

public class Main_201914089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("lab11_1:오동재");
		System.out.println("정렬 알고리즘 insertion sort");
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		Meeting[] array = new Meeting[n];
		
		for (int i = 0; i < n; i++) {
			String str = scanner.nextLine();
			String strArray[] = str.split(" ");
			array[i] = new Meeting(strArray[0], Integer.parseInt(strArray[1]), Integer.parseInt(strArray[2]));
		}
		
		insertti
	}
	
	public static void insertionSort(Meeting[] meetings) {
		for (int i = 1; i < meetings.length; i++) {
			int item = meetings[i].endTime;
			int j;
			for (j = i; (j > 0) && (meetings[j-1].endTime > item); j--) {
				meetings[j] = meetings[j-1];
			}
			meetings[j].endTime = item;
		}
	}

}

class Meeting {
	String id;
	int startTime;
	int endTime;
	
	Meeting(String id, int startTime, int endTime) {
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
	}
}
