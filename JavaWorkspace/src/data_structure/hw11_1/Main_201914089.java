package data_structure.hw11_1;

import java.util.Scanner;

public class Main_201914089 {

	public static void main(String[] args) {
		
		System.out.println("hw11_1:오동재");
		System.out.println("정렬 알고리즘 insertion sort");
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 회의 갯수 입력받기
		scanner.nextLine(); // .nextInt()의 개행 정보 입력받아 소비하기
		
		Meeting[] array = new Meeting[n]; // 원소가 Meeting형, 크기 n인 객체 배열 선언
		
		for (int i = 0; i < n; i++) { // n번 반복하며
			String str = scanner.nextLine(); // 회의 정보 입력
			String strArray[] = str.split(" "); // 회의 정보를 띄어쓰기 기준으로 배열에 저장
			// 해당 배열의 순서대로 id, startTime, endTime 정보를 이용하여 객체 생성 및 초기화
			array[i] = new Meeting(strArray[0], Integer.parseInt(strArray[1]), Integer.parseInt(strArray[2]));
		}
		
		insertionSort(array); // 삽입 정렬 실행
		
		System.out.println("종료시간 기준 정렬 결과");
		for (Meeting meeting : array) { // 해당 배열을 순회하며 정렬된 결과를 출력
			System.out.println(meeting.id + " " + meeting.startTime + " " + meeting.endTime);
		}
		
		scanner.close();
		
		System.out.println("안녕하세요");
	}
	
	// 삽입 정렬 메소드
	public static void insertionSort(Meeting[] meetings) { // Meeting형 객체 배열을 매개변수로 받아
		for (int i = 1; i < meetings.length; i++) { // index 1부터 끝까지 순회하며
			Meeting item = meetings[i]; // i번째 객체를 item 변수에 임시 저장
			int j;
			// i번부터 시작하여 자신의 전순서 객체의 종료 시간이 더 클 경우 자리 교체  
			for (j = i; (j > 0) && (meetings[j-1].endTime > item.endTime); j--) {
				meetings[j] = meetings[j-1];
			}
			meetings[j] = item;
		}
	}

}

// Meeting 클래스
class Meeting {
	String id; // 회의명 필드
	int startTime; // 시작시간 필드
	int endTime; // 종료시간 필드
	
	// 생성자
	Meeting(String id, int startTime, int endTime) {
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
	}
}
