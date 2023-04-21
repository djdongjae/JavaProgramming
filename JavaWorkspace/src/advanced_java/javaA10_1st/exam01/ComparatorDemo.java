package advanced_java.javaA10_1st.exam01;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"로마에 가면 로마법을 따르라.", "시간은 금이다.", "펜은 칼보다 강하다."};
		
		Arrays.sort(strings,(f, s) -> f.length() - s.length());
		
		for(String s : strings)
			System.out.println(s);

	}

}
