package java_homework.practice.collections.sec04;

import java.util.*;

public class SetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		
		set1.add("A");
		set1.add("B");
		set1.add("C");
		
		set2.add("B");
		set2.add("C");
		set2.add("D");
		
		Set<String> union = new HashSet<>(set1);
		Set<String> intersection = new HashSet<>(set2);
		
		union.addAll(set2);
		intersection.retainAll(set1);
		
		System.out.println(union);
		System.out.println(intersection);

	}

}
