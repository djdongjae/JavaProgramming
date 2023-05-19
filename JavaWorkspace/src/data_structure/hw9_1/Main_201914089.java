package data_structure.hw9_1;

import java.util.Scanner;

public class Main_201914089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		
		System.out.println("hw9_1:오동재");
		MyBinarySearchTree tree = new MyBinarySearchTree(); // 공백 트리 생성
		int n = input.nextInt(); // 노드 삽입 횟수 입력
		for(int i=0; i<n; i++) { // 횟수간 반복
			int key = input.nextInt(); // key 입력
			int value = input.nextInt(); // value 입력
			tree.insert(key, value); // 입력받은 노드 삽입
		}
		tree.inorder(); // 트리 중위 순회
		input.close();

	}

}

class MyBinarySearchTree {

	private Node root = null; // 루트 노드 null로 설정
	
	// 노드 클래스
	private class Node {
		int key; // 노드 클래스 key
		int value; // 노드 클래스 value
		Node leftChild; // 노드의 왼쪽 자식 주소값 저장 공간
		Node rightChild; // 노드의 오른쪽 자식 주소값 저장 공간

		public Node(int key, int value) { // 노드 초기화 생성자
			this.key = key; // key값 초기화
			this.value = value; // value값 초기화
		}
	}
	
	// 해당 트리의 중위 순회 메소드(매개 변수 없음)
	public void inorder() { 
		inorder(root); // 매개 변수 있는 중위 순회 메소드(루트 노드 전달)
		System.out.println();
	}
	
	private void inorder(Node p) {
		if(p != null) { // 해당 노드가 존재할 경우
			inorder(p.leftChild); // 해당 노드의 왼쪽 서브 트리부터 순회
			System.out.print("(" + p.key + ", " + p.value + ") "); // 해당 노드 정보 출력
			inorder(p.rightChild); // 해당 노드의 오른쪽 서브 트리 순회
		}
	}
	
	// 삽입 알고리즘
	public void insert(int key, int value) { // key, value를 매개변수로 받는 삽입 메소드
		root = insertKey(root, key, value); // 실제 삽입 결과에 대한 트리 정보를 루트에 저장
	}
	
	private Node insertKey(Node p, int key, int value) { // Node, key, value를 매개변수로 받는 삽입 메소드
		if(p == null) { // 해당 노드가 null일 경우
			Node newNode = new Node(key, value); // 노드형 변수 생성
			newNode.key = key; // key 저장
			newNode.value = value; // value 저장
			newNode.leftChild = null; // 해당 노드는 단말 노드이므로 자식 없음
			newNode.rightChild = null; // 해당 노드는 단말 노드이므로 자식 없음
			return newNode; // 해당 노드 반환
		} else if(key < p.key) { // 해당 노드의 key가 삽입하려는 노드의 key보다 클 경우
			p.leftChild = insertKey(p.leftChild, key, value); // 재귀를 통해 알맞은 위치에서 노드 생성 후 삽입
			return p; // 갱신된 정보 반환
		} else if(key > p.key) { // 해당 노드의 key가 삽입하려는 노드의 key보다 작을 경우
			p.rightChild = insertKey(p.rightChild, key, value); // 재귀를 통해 알맞은 위치에서 노드 생성 후 삽입
			return p; // 갱신된 정보 반환
		} else { // 해당 노드의 key가 삽입하려는 노드의 key와 같을 경우
			p.value = value; // value 값 갱신
			return p; // 갱신된 정보 반환
		}
	}
}