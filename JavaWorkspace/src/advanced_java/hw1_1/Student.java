package advanced_java.hw1_1;

//***************************
//파일명: Student.java
//작성자: 오동재
//작성일: 2023-03-10
//내용: hw1_1
//***************************

public class Student {
	
	private String name;
	private int credit;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public int getCredit() {
		return credit;
	}
	
	public int calculate() {
		if(credit > 6) {
			return 3000000;
		} else {
			return credit * 200000;
		}
	}
	
	public void print() {
		System.out.println("이름: " + name);
		System.out.println("신청학점수: " + credit);
	}

}
