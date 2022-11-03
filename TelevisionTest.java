package java_homework.hw9_1;

//***************************
//파일명: TelevisionTest.java
//작성자: 오동재
//작성일: 2022.11.03
//내용: Television 생성자, 정적변수/메소드
//**************************

public class TelevisionTest {

	public static void main(String[] args) {
		System.out.println("[hw9_1] Television 생성자, 정적변수/메소드 / 2019140898 오동재 \n");
		
		// TODO Auto-generated method stub
		System.out.print("현재까지 생성된 텔레비전 수: ");
		System.out.println(Television.numberOfTVs);
		
		Television tv1 = new Television();
		Television tv2 = new Television("lg");
		Television tv3 = new Television("sony", 100);
		
		System.out.println(tv1);
		System.out.println(tv2);
		System.out.println(tv3);
		
		System.out.print("현재까지 생성된 텔레비전 수: ");
		System.out.println(Television.numberOfTVs);

	}

}
