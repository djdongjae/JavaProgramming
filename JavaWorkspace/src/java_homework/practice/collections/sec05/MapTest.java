package java_homework.practice.collections.sec05;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("2009001", new Student(2009001, "오동재"));
		st.put("2009002", new Student(2009002, "박지은"));
		st.put("2009003", new Student(2009003, "왕이보"));
		
		System.out.println(st);
		
		st.remove("2009002");
		//하나의 항목을 대치한다.
		st.put("2009003", new Student(2009003, "소이정"));
		//값을 참조한다.
		System.out.println(st.get("2009003"));
		//모든 항목을 방문한다.
		for (Map.Entry<String, Student> s: st.entrySet()) {
			System.out.println(s);
		}
	}
}
