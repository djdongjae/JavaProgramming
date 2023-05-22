package hansotbap.week06.app;

import hansotbap.week06.lib.Airliner;
import hansotbap.week06.lib.Fighter;

public class AirplaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airliner a1=new Airliner("A100", 300);  //Airliner 클래스에 대한 객체 생성/매개변수가 하나인 생성자로의 접근.
		a1.showInfo(); //오버라이딩된 메소드 호출
		
		System.out.println();
		
		a1.takeoff();
		a1.flight();
		a1.landing();
		
		System.out.println();
		
		Fighter b1=new Fighter("F300");
		b1.showInfo();
		
		System.out.println();
		
		b1.loadWeapon();
		
		System.out.println();
		
		b1.takeoff();
		b1.flight();
		
		System.out.println();
		
		b1.showWeapon();
		System.out.println();
		
		b1.selectWeapon();
		
		System.out.println();
		
		b1.landing();
	}

}
