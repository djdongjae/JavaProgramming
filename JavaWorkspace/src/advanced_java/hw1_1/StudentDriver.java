package advanced_java.hw1_1;

//***************************
//파일명: StudentDriver.java
//작성자: 201914089 오동재
//작성일: 2023-03-10
//내용: hw1_1
//***************************

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hw1_1: 오동재");
		
		Student s1 = new Student();
		ForeignStudent s2 = new ForeignStudent();
		VisitingStudent s3 = new VisitingStudent();
		
		s1.setName("Kim");
		s1.setCredit(20);
		
		s2.setName("Jobs");
		s2.setCredit(5);
		s2.setNation("USA");
		
		s3.setName("Lee");
		s3.setCredit(8);
		s3.setSchool("강원대");
		
		s1.print();
		s2.print();
		s3.print();
		int sum = s1.calculate() + s2.calculate() + s3.calculate();
		System.out.println("등록금 합 = " + sum);

	}

}
