package java_homework.practice.interface12.sec03;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box(99.9);
		Box b2 = new Box(99.8);
		
		if (b1.compareTo(b2) > 0)
			System.out.println("b1이 더 크다.");
		else
			System.out.println("b1이 작거나 같다.");

	}

}
