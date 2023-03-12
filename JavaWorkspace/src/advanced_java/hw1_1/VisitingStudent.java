package advanced_java.hw1_1;

//***************************
//파일명: VisitingStudent.java
//작성자: 오동재
//작성일: 2023-03-10
//내용: hw1_1
//***************************

public class VisitingStudent extends Student {
	
	private String school;
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public String getSchool() {
		return school;
	}
	
	@Override
	public int calculate() {
		return getCredit() * 100000;
	}
	
	@Override
	public void print() {
		System.out.println("이름: " + getName() + " 학점: " + getCredit() + " 국적: " + getSchool());		
	}

}
