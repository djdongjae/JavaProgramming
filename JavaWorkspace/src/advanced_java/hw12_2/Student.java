package advanced_java.hw12_2;

//***************************
//파일명: Student.java
//작성자: 201914089 오동재
//작성일: 2023-04-28
//내용: hw12_2
//***************************

import java.util.List;

public class Student {
	
	private final String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static final List<Student> students = List.of(
			new Student("민국"),
			new Student("지우"),
			new Student("하준"),
			new Student("지우"),
			new Student("하준"),
			new Student("지우")
			);

}
