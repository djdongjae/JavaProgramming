package hansotbap.week05.exam07;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Word> array = new ArrayList<Word>();
		Scanner input = new Scanner(System.in);

		array.add(new Word("house", "집"));
		array.add(new Word("learning", "학습"));
		array.add(new Word("clock", "시계"));
		array.add(new Word("computer", "컴퓨터"));

		System.out.print("검색할 영어 단어를 입력하시오(종료는 quit): ");

		String data = input.next();
		boolean check = false;
		while (true) {
			if (data.equals("quit")) {
				break;
			} else {
				for(Word word: array) {
					if(word.getEng().equals(data)) {
						System.out.println(data + " -> " + word.getKor());
						check = true;
						break;
					} 
				}
				if(!check)	System.out.println("사전에 없는 단어입니다.");
			}
			System.out.print("검색할 영어 단어를 입력하시오(종료는 quit): ");
			data = input.next();
			check = false;
		}

	}

}
