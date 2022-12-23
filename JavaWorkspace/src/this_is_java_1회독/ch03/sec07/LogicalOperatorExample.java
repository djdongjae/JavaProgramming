package this_is_java_1회독.ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'A';
		if( (65 <= charCode) & (charCode <= 90) ) {
			System.out.println("대문자이군요.");
		}
		
		if( (97 <= charCode) && (charCode <= 120)) {
			System.out.println("소문자이군요.");
		}
		
		if( (48 <= charCode) && (charCode <= 57)) {
			System.out.println("0~9 숫자이군요,");
		}

		int value = 6;
		if(( value%2 == 0) | (value%3 == 0)) {
			System.out.println("2또는 3이 배수이군요");
		}
		
		boolean result1 = (value%2 == 0) || (value%3 == 0);
		if(!result1) {
			System.out.println("2의 배수 또는 3의 배수가 아니군요.");
		}
		
	}

}
