package this_is_java_1회독.ch16.sec05.exam01;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		person.action(Computer :: staticMethod);
		
		Computer com = new Computer();
		person.action(com :: instanceMethod);

	}

}
