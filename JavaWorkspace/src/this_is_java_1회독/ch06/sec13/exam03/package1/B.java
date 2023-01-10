package this_is_java_1회독.ch06.sec13.exam03.package1;

public class B {
	public void method() {
		A a = new A();
		
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1;
		
		a.method1();//public
		a.method2();//default
		//a.method3();//private
	}

}
