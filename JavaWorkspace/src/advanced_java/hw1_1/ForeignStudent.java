package advanced_java.hw1_1;

//***************************
//파일명: ForeignStudent.java
//작성자: 오동재
//작성일: 2023-03-10
//내용: hw1_1
//***************************

public class ForeignStudent extends Student {
	
	private String nation;
	
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	public String getNation() {
		return nation;
	}
	
	@Override
	public void print() {
		System.out.println("이름: " + getName() + " 학점: " + getCredit() + " 국적: " + getNation());
	}

}
