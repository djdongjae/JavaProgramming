package this_is_java_1회독.ch07.sec06.package2;

import this_is_java_1회독.ch07.sec06.package1.A;

public class D extends A{
	//생성자 선언
	public D() {
		//A() 생성자 호출
		super();
	}
	
	//메소드 선언
	public void method1() {
		//A의 필드값 변경
		this.field = "value";
		this.method();
	}
	
	//메소드 선언
	public void method2() {
		//A a = new A();
		//a.field = "value";
		//a.method();
	}

}
