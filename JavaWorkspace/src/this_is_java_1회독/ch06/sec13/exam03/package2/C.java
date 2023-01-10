package this_is_java_1회독.ch06.sec13.exam03.package2;

import this_is_java_1회독.ch06.sec13.exam03.package1.*;

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1; //public
		//a.field2 = 1; //default
		//a.field3 = 1; //private
		
		a.method1(); //public
		//a.method2(); //default: 같은 패키지만
		//a.method3(); //private: 같은 클래스만
	}

}
