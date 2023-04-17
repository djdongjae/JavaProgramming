package advanced_java.javaA12_1st.exam05;

import java.util.stream.IntStream;

public class Laziness1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream is = IntStream.rangeClosed(1, 5);
		
		is.filter(x -> {
			System.out.println("filter : " + x);
			return x % 2 == 0;
		}).map(x -> {
			System.out.println("map : " + x);
			return x * x;
		}).forEach(x -> System.out.println("forEach : " + x));

	}

}
