package this_is_java_2ndReading.ch07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		
		p.field1 = "data1";
		p.method1();
		p.method2();
		
		Child c = (Child) p;
		
		c.field2 = "data2";
		c.method3();

	}

}
