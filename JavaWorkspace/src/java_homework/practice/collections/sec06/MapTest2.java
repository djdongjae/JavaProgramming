package java_homework.practice.collections.sec06;

import java.util.*;

public class MapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap<String, Integer>();
		String[] sample = {"to", "be", "or", "to", "be", "not", "is", "a", "problem"};
		
		for (String a : sample) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
		}
		
		System.out.println(m.size() + "단어가 있습니다.");
		System.out.println(m.isEmpty());
		System.out.println(m.containsKey("to"));
		System.out.println(m);

	}

}
