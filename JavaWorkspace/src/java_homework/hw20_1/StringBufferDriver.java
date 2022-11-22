package java_homework.hw20_1;

//***************************
//파일명: Driver.java
//작성자: 오동재
//작성일: 2022.11.22
//내용: 문자열 더하기
//***************************

public class StringBufferDriver {

	public static void main(String[] args) {
		System.out.println("hw20_1: 201914089 오동재\n");
		
		//문자열 및 길이 준비
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String[] array_alphabet = alphabet.split("");
		int alpha_len = alphabet.length();
		
		//String
		long beforeTime1 = System.nanoTime(); //코드 실행 전에 시간 받아오기
		
		String[] array = new String[alpha_len];
		String s = "";
		for(int i=0; i<alpha_len; i++) {
			array[i] = array_alphabet[i].repeat(i+1);
			s = s.concat(array[i]);
		}
		System.out.println(s);
		long afterTime1 = System.nanoTime(); // 코드 실행 후에 시간 받아오기
		long s_time = (afterTime1 - beforeTime1); //두 시간에 차 계산
		System.out.println("String 실행시간 : "+s_time);
		
		System.out.println();
		
		//StringBuffer
		long beforeTime2 = System.nanoTime(); //코드 실행 전에 시간 받아오기
        

		StringBuffer sb = new StringBuffer("");
		
		for(int i=0;i<alpha_len;++i) {
			for(int j=0;j<=i;++j){
				sb.append(array_alphabet[i]);
			}
		}
		System.out.println(sb);
		        
		long afterTime2 = System.nanoTime(); // 코드 실행 후에 시간 받아오기
		long sb_time = (afterTime2 - beforeTime2); //두 시간에 차 계산
		System.out.println("StringBuffer 실행시간 : "+ sb_time);

	}

}

