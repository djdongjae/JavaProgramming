package java_homework.practice.collections.sec02;

import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Milk");
		list.add("Bread");
		list.add("Butter");
		list.add(1, "Apple");
		list.set(2, "Grape");
		list.remove(3);
		
		for (String s : list) {
			System.out.println(s);
		}

	}

}
