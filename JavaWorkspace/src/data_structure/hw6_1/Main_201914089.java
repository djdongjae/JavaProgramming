package data_structure.hw6_1;

import java.util.Scanner;


public class Main_201914089 {
	public static void main(String[] args) {
		System.out.println("lab6_1:오동재");
		Scanner input = new Scanner(System.in);

// (1) 단어를 저장할 MyLinkedList 객체 list를 생성
		MyLinkedList list = new MyLinkedList();

// (2) 단어 수(n)와 n개의 단어를 입력받아 list의 맨 뒤에 차례대로 삽입 후, list 출력
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			String word = input.next();
			list.add(word);
		}
		System.out.println(list);
		
		String w = input.next();
		String x = input.next();
		String y = input.next();
		String z = input.next();
		
		System.out.println(list.indexOf(w) + " ");
		System.out.println(list.indexOf(x) + " ");
		System.out.println(list.indexOf(y) + " ");
		System.out.println(list.indexOf(z));

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
		Node newNode = new Node();
		newNode.data = data;
		
		if(head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while(temp.rightLink != null) {
				temp = temp.rightLink;
			}
			temp.rightLink = newNode;
			newNode.leftLink = temp;
		}
		size++;
	}
	
	public int indexOf(String data) {
		Node temp = head;
		int index = 0;
		while (temp != null) {
			if (temp.data.equals(data)) {
				return index;
			}
			index++;
			temp = temp.rightLink;
		}
		return -1;
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