package data_structure.lab9_1;

public class Main_201914089 {
	public static void main(String[] args) {
		System.out.println("lab9_1:오동재");

		// 공백 이진탐색트리를 생성(tree)
		SampleBinarySearchTree tree = new SampleBinarySearchTree();

		// 트리를 중순위 순회
		tree.inorder();
		System.out.println("hello world");
	}
}

class SampleBinarySearchTree {
	// 트리 구현을 위한 변수와 클래스를 선언하고, inorder 메소드를 구현
	private Node root = null;

	private class Node {
		int key;
		Node leftChild;
		Node rightChild;

		public Node(int key) {
			this.key = key;
		}
	}

	// 몇 개의 노드를 갖도록 샘플 트리를 생성
	public SampleBinarySearchTree() {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		root = n3;
		n3.leftChild = n1;
		n3.rightChild = n5;
		n1.rightChild = n2;
		n5.leftChild = n4;
	}
	
	public void inorder() {
		inorder(root);
		System.out.println();
	}
	
	private void inorder(Node p) {
		if(p != null) {
			inorder(p.leftChild);
			System.out.print(p.key + " ");
			inorder(p.rightChild);
		}
	}
}