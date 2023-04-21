package advanced_java.javaA10_1st.exam02;

interface Negative {
	int neg(int x);
}

interface Printable {
	void print();
}

public class Lambda2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Negative n;
		n = (int x) -> {return -x;};
		n = (x) -> {return -x;};
		n = x -> {return -x;};
		n = (int x) -> -x;
		n = (x) -> -x;
		n = x -> -x;
		Printable p;
		p = () -> {System.out.println("안녕!");};
		p = () -> System.out.println("안녕!");
		p.print();

	}

}
