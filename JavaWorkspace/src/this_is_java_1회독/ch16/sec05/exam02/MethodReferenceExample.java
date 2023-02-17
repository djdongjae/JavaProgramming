package this_is_java_1회독.ch16.sec05.exam02;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.ordering(String :: compareToIgnoreCase);
	}

}
