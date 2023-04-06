package data_structure.hw6_1;

/*
 * 1. indexOf 추가 완료
 * 2. remove 추가 완료
 * 3. 이중연결리스트로 구현 완료
 */

import java.util.Scanner;

public class Main_201914089 {
	public static void main(String[] args) {
		System.out.println("lab6_1:오동재");
		Scanner input = new Scanner(System.in);

        // (1) 단어를 저장할 MyLinkedList 객체 list를 생성
		MyLinkedList list = new MyLinkedList();

        // (2) 단어 수(n)와 n개의 단어를 입력받아 list의 맨 뒤에 차례대로 삽입 후, list 출력
		int n = input.nextInt();
		
		//(3) n개의 단어 입력
		for (int i = 0; i < n; i++) {
			String word = input.next();
			list.add(word);
		}
		//(4) 입력 받은 단어 출력
		System.out.println(list);
		
		//(5) 4개의 데이터 입력
		String w = input.next();
		String x = input.next();
		String y = input.next();
		String z = input.next();
		
		//(6) 4개의 데이터 인덱스 출력
		System.out.println(list.indexOf(w) + " " + list.indexOf(x) + " " + list.indexOf(y) + " " + list.indexOf(z));
		
		//(7) 4개의 데이터 순차적으로 삭제
		list.remove(w);
		System.out.println(list);
		list.remove(x);
		System.out.println(list);
		list.remove(y);
		System.out.println(list);
		list.remove(z);
		System.out.println(list);
		
		input.close();
	}
}

// 문자열 리스트를 단순 연결리스트로 구현하는 클래스
class MyLinkedList {
	// private 인스턴스 변수 선언(head, size)
	//...
	private Node head;
	private int size;

    // 리스트의 노드 구조를 나타내는 클래스
	private class Node {
		// ...
		String data;
		Node rightLink;
		Node leftLink;
	}

    // 공백 리스트를 생성하는 생성자
	public MyLinkedList() {
		// ...
		head = null;
		size = 0;
	}

    // 리스트의 맨 뒤에 data를 삽입하는 메소드
	public void add(String data) {
		// ...
		Node newNode = new Node(); // 추가될 데이터의 주소를 저장하는 newNode 선언
		newNode.data = data;// newNode의 데이터 필드에 추가될 데이터 저장
		
		if(head == null) {
			head = newNode;// 만약 기존에 리스트가 null이라면 head에 newNode의 주소를 바로 저장
		} else {
			Node temp = head;// null이 아니라면 순회하며 가장 마지막 노드를 찾음
			while(temp.rightLink != null) {
				temp = temp.rightLink;
			}
			temp.rightLink = newNode;// 탐색을 완료하면 마지막 노드의 우측 링크 필드에 newNode의 주소를 저장
			newNode.leftLink = temp;// newNode의 좌측 필드에 temp의 주소를 저장
		}
		size++;// 하나 추가할 때마다 size 하나씩 증가
	}
	
	public int indexOf(String data) {
		Node temp = head;
		int index = 0;
		while (temp != null) {// 처음부터 하나씩 순회하며
			if (temp.data.equals(data)) {// 해당 데이터와 일치하는 정보가 있는지 탐색
				return index;// 해당 데이터와 일치하는 필드가 있을 시 해당 인덱스를 반환
			}
			index++;
			temp = temp.rightLink;// 하나씩 오른쪽으로 순차 탐색
		}
		return -1;// 마지막까지 돌았는데도 없으면 -1을 반환
	}
	
	public void remove(String data) {// 해당 데이터를 삭제하는 메소드
		Node temp = head;
		while(temp != null) {// 처음부터 순회하며
			if(temp.data.equals(data)) {// 일치하는 데이터 발견시
				if(temp.leftLink != null) {// 해당 데이터가 첫번째 원소가 아닐 때
					temp.leftLink.rightLink = temp.rightLink;// 해당 원소를 삭제(우측 방향으로 링크)
				} else {// 해당 데이터가 첫번째 원소일 때
					head = temp.rightLink;// 해당 데이터를 삭제하고 바로 다음 원소를 head와 연결
				}
				if(temp.rightLink != null) {// 해당 데이터가 마지막 원소가 아닐 때
					temp.rightLink.leftLink = temp.leftLink;// 해당 원소를 삭제(좌측 방향 링크)
				}
				size--;// 삭제시 사이즈 감소
			}
			temp = temp.rightLink;// 하나씩 오른쪽으로 순차 탐색
		}
	}

	@Override
	public String toString() { // LinkedList와 구분하기 위해 [] 대신에 ()를 사용할 것
		StringBuffer result = new StringBuffer("(");
		Node temp = head;
		if (size > 0) {
			for (int i = 0; i < size - 1; i++) {
				result.append(temp.data + ", ");
				temp = temp.rightLink;
			}
			result.append(temp.data);
		}
		result.append(")");
		return result.toString();
	}
}