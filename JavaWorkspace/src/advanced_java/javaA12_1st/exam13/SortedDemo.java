package advanced_java.javaA12_1st.exam13;

import java.util.Comparator;
import java.util.stream.Stream;

import advanced_java.javaA12_1st.exam02.Nation;
import advanced_java.javaA12_1st.exam02.Util;

public class SortedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> s1 = Stream.of("d2", "a2", "b1", "b3", "c");
		Stream<String> s2 = s1.sorted();
		s2.forEach(Util::print);
		
		System.out.print("\n국가 이름 순서: ");
		Stream<Nation> n1 = Nation.nations.stream();
		Stream<Nation> n2 = n1.sorted(Comparator.comparing(Nation::getName));
		Stream<String> s3 = n2.map(x -> x.getName());
		s3.forEach(Util::printWithParenthesis);
		
		System.out.print("\n국가 GDP 순서 : ");
		Stream<Nation> n3 = Nation.nations.stream();
		Stream<Nation> n4 = n3.sorted(Comparator.comparing(Nation::getGdpRank));
		Stream<String> s4 = n4.map(Nation::getName);
		s4.forEach(Util::printWithParenthesis);

	}

}
