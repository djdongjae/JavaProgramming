package hansotbap.week04.exam02;

public class PersonDriver {
	
	public static void main(String[] args) {
		
		Person obj = new Person("오동재", "010-3321-6504", "031-705-6503", "jk47wee@gmail.com");
		
		System.out.println(obj.toString());
		
		obj.setName("홍길동");
		obj.setMobile("010-1234-5678");
		obj.setOffice("02-123-1224");
		obj.setEmail("hong@naver.com");
		
		System.out.println(obj.toString());
		
	}

}
