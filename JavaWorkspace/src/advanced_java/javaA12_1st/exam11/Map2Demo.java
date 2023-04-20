package advanced_java.javaA12_1st.exam11;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import advanced_java.javaA12_1st.exam02.Nation;
import advanced_java.javaA12_1st.exam02.Util;

public class Map2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Nation> n1 = Nation.nations.stream();
		Stream<String> s1 = n1.map(Nation::getName);
		s1.limit(4).forEach(Util::printWithParenthesis);
		System.out.println();
		
		Stream<Nation> n2 = Nation.nations.stream();
		IntStream is = n2.mapToInt(Nation::getGdpRank);
		is.forEach(Util::print);

	}

}
