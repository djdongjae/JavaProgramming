package advanced_java.javaA12_1st.exam15;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import advanced_java.javaA12_1st.exam02.Nation;
import advanced_java.javaA12_1st.exam02.Util;

public class LoopAggregateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Nation> sn = Nation.nations.stream().peek(Util::printWithParenthesis);
		System.out.println("어디 나타날까?");
		Optional<Nation> on = sn.max(Comparator.comparing(Nation::getPopulation));
		System.out.println();
		System.out.println(on.get());
		
		System.out.println(IntStream.of(5, 1, 2, 3).min().getAsInt());
		
		sn = Nation.nations.stream();
		System.out.println(sn.count());

	}

}
