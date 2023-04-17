package advanced_java.javaA12_1st.exam09;

import java.util.stream.Stream;

import advanced_java.javaA12_1st.exam02.Util;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2", "c3");
		Stream<String> s2 = s1.filter(s -> s.startsWith("c"));
		Stream<String> s3 = s2.skip(1);
		System.out.print("문자열 스트림 : ");
		s3.forEach(Util :: print);
	}

}
