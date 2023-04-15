package advanced_java.hw12_1;

//***************************
//파일명: StreamFilter.java
//작성자: 201914089 오동재
//작성일: 2023-04-14
//내용: hw12_1
//***************************

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {

	public static void main(String[] args) {
		System.out.println("hw12_1 오동재");
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("갈매기");
		list.add("나비");
		list.add("다람쥐");
		list.add("라마");
		
		list.stream()
		.filter(n -> n.length() < 3)
		.limit(1)
		.forEach(n -> System.out.println(n));
	}

}
