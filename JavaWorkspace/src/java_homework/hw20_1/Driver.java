package java_homework.hw20_1;

public class Driver {

	public static void main(String[] args) {
		//
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String[] array_alphabet = alphabet.split("");
		int alpha_len = alphabet.length();
		
		//String
		long beforeTime1 = System.nanoTime(); //코드 실행 전에 시간 받아오기
		
		String[] array = new String[alpha_len];
		String s2 = "";
		for(int i=0; i<alpha_len; i++) {
			array[i] = array_alphabet[i].repeat(i+1);
			s2.concat(array[i]);
		}
		
		long afterTime1 = System.nanoTime(); // 코드 실행 후에 시간 받아오기
		long s_time = (afterTime1 - beforeTime1); //두 시간에 차 계산
		System.out.println("String 실행시간 : "+s_time);
		
		System.out.println();
		
		//StringBuffer
		long beforeTime2 = System.nanoTime(); //코드 실행 전에 시간 받아오기
        

		StringBuffer sb = new StringBuffer("a");
		
		for(int i=0;i<alpha_len;i++) {
			for(int j=0;j<i;j++){
				sb.append(array_alphabet[i]);
			}
		}
		System.out.println(sb);
		        
		long afterTime2 = System.nanoTime(); // 코드 실행 후에 시간 받아오기
		long sb_time = (afterTime2 - beforeTime2); //두 시간에 차 계산
		System.out.println("StringBuffer 실행시간 : "+ sb_time);

	}

}
