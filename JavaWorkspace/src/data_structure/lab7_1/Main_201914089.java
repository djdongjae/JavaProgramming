package data_structure.lab7_1;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Main_201914089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab7_1: 오동재");
		Scanner input = new Scanner(System.in);
		
		MyLinkedStack stack = new MyLinkedStack();
		
		stack.push(30);
		stack.push(40);
		int x = stack.pop();
		int y = stack.pop();
		int result = x - y;
		System.out.println(result);
		
		String str;
		String[] strArray;
		str = input.nextLine();
		strArray = str.split(" ");
		
		
	}

}

class MyLinkedStack {
	private class Node {
		int data;
		Node link;
	}
	
	private Node top = null;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(int item) {
		Node newNode = new Node();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		} else {
			int item = top.data;
			top = top.link;
			return item;
		}
	}
}