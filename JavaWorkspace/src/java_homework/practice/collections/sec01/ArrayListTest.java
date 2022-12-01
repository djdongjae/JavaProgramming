package java_homework.practice.collections.sec01;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Milk");
		list.add("Bread");
		list.add("Butter");
		list.add(1, "Apple");
		list.set(2, "Grape");
		list.remove(0);
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
