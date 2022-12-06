package java_homework.practice.collections.sec08;

import java.util.*;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student array[] = {
				new Student(2009001, "김철수"),
				new Student(2009002, "이철수"),
				new Student(2009003, "박철수")
		};
		List<Student> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println(list);
	}
}
