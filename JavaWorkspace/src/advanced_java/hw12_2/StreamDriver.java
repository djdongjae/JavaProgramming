package advanced_java.hw12_2;

//***************************
//파일명: StreamDriver.java
//작성자: 201914089 오동재
//작성일: 2023-04-28
//내용: hw12_2
//***************************

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDriver {
	
	public static void main(String[] args ) {
		System.out.println("hw12_2 오동재");

		Stream<Student> sn = Student.students.stream();
				
		Map<String, Long> map = sn.collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
		System.out.println(map);
	}
}
