package hansotbap.week04.exam05;

public class Student {
	
	String name;
	private int rollno;
	int age;
	
	public Student(String name, int rollno, int age) {
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	
	public String toString() {
		return String.format("""
				학생의 이름: %s
				학생의 학번: %s
				학생의 나이: %s
				Student 객체가 생성되었습니다.
				""", name, rollno, age);
	}

}
