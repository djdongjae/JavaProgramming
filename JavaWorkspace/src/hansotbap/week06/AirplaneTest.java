package hansotbap.week06;

public class AirplaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airliner a1=new Airliner("A100");  //Airliner 클래스에 대한 객체 생성/매개변수가 하나인 생성자로의 접근.

		a1.showInfo(); //오버라이딩된 메소드 호출
		Airliner a2=new Airliner("A200",500);//매개변수가 두개인 생성자로의 접근
		a2.showInfo();
		
		Fighter b1=new Fighter("F300");
		b1.showInfo();
		
		Fighter b2=new Fighter("F400",true);
		b2.showInfo();
		
		System.out.println("hello world");
	}

}
