package data_structure.hw7_1;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Main_201914089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_1: 오동재");
		Scanner input = new Scanner(System.in);
		
		MyLinkedStack stack = new MyLinkedStack(); // MyLinkedStack 객체 생성
		
		stack.push(30); // 30 push
		stack.push(40); // 40 push
		int x = stack.pop(); // 40 pop
		int y = stack.pop(); // 30 pop
		int result = x - y; // 40 - 30
		System.out.println(result); // 결과 출력
		
		// 추가 문제 구현
		String str; // 입력 받을 문자열
		String[] strArray; // 문자열 배열
		str = input.nextLine(); // 후위 연산식 입력 받기
		strArray = str.split(" "); // 공백 단위로 문자열 배열에 저장
		for(int i=0; i < strArray.length; i++) { // 반복하며 배열의 원소에 접근
			if(strArray[i].equals("+")) { // 연산자일 경우 pop 두번을 통해 연산 수행
				y = stack.pop();
				x = stack.pop();
				stack.push(x + y);
			} else if(strArray[i].equals("-")) {
				y = stack.pop();
				x = stack.pop();
				stack.push(x - y);
			} else if(strArray[i].equals("*")) {
				y = stack.pop();
				x = stack.pop();
				stack.push(x * y);
			} else if(strArray[i].equals("/")) {
				y = stack.pop();
				x = stack.pop();
				stack.push(x / y);
			} else { // 피연산자일 경우 정수형으로 변환하여 스택에 저장
				stack.push(Integer.parseInt(strArray[i]));
			}
		}
		System.out.println(stack.pop()); // 결과 출력
		input.close();
		
	}

}

class MyLinkedStack {
	private class Node { // Node형 클래스 선언
		int data;
		Node link;
	}
	
	private Node top = null;
	
	public boolean isEmpty() { // 비어있는 스택인지 검사
		return (top == null); // top이 null일 경우 참을 반환
	}
	
	public void push(int item) { // push 메소드 구현
		Node newNode = new Node(); // 노드형 객체 생성
		newNode.data = item; // 노드형 객체 data 필드에 push할 item 저장 
		newNode.link = top; // 이전 스택의 top의 주소를 link 필드에 저장
		top = newNode; // top 갱신
	}
	
	public int pop() { // pop 메소드 구현
		if(isEmpty()) { // 비어있는 스택일 경우
			throw new EmptyStackException(); 
		} else { // 무엇인가 담겨있는 스택일 경우
			int item = top.data; // top의 data 필드에 접근
			top = top.link; // top 갱신
			return item; // 해당 데이터 반환
		}
	}
}