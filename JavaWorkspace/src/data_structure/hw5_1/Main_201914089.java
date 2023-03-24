package data_structure.hw5_1;

import java.util.Scanner;

public class Main_201914089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw5_1:오동재");
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		MyArrayList list = new MyArrayList(2*n);
		System.out.println(list);
		
		for(int i=0; i<n; i++) {
			String word = input.next();
			list.add(word);
		}
		
		System.out.println(list);
		
		String x = input.next();
		int index1 = list.contains(x);
		if(index1 == -1) {
			list.add(x);
			System.out.println(list);
		} else {
			list.remove(index1);
			System.out.println(list);
		}
		
		String y = input.next();
		int index2 = list.contains(y);
		if(list.contains(y) == -1) {
			list.add(y);
			System.out.println(list);
		} else {
			list.remove(index2);
			System.out.println(list);
		}
		
		
	}

}

class MyArrayList {
	private String[] array;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	
	public MyArrayList() {
		array = new String[DEFAULT_CAPACITY];
		size = 0;
	}
	
	public MyArrayList(int capacity) {
		array = new String[capacity];
		size = 0;
	}
	
	public int contains(String item) {
		for(int i=0; i<size; i++) {
			if(array[i].equals(item)) {
				return i;
			} else continue;
		} return -1;
	}
	
	public void remove(int index) {
		for(int j=index+1; j<=size; j++) {
				array[j-1] = array[j];
		}
		size--;
	}
	
	public void add(String item) {
		if(size >= array.length) {
			System.out.println("배열이 가득차서 삽입 실패했습니다.");
		} else {
			array[size++] = item;
		}
	}
	
	@Override
	public String toString() {
		if(size == 0) {
			return "[]";
		}
		else {
			StringBuffer result = new StringBuffer("[");
			for(int i=0; i<size-1; i++) {
				result.append(array[i] + ", ");
			}
			result.append(array[size-1] + "]");
			return result.toString();
		}
	}
}