package data_structure.lab3_1;

/*
 * 키보드로 2개의 정수값을 입력받아 두 값의 평균을 출력하는 프로그램을 작성하세요.
   
클래스 이름은 Main으로 할 것
 
힌트: 
import java.util.Scanner;
  
public class Main {
    public static void main(String[] args) {
        System.out.println("lab3_1:홍길동");
         
         // 키보드로 하나의 정수값 입력        
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();       
 
        // 정수값 출력
        System.out.println(num);    
    
        input.close();
    }
}
 
- 들여쓰기 기능(Correct Indentation)을 이용하여 들여쓰기를 수정하세요.
- 홍길동은 본인의 성명으로 바꾸세요.
 
- 실행 예:
lab3_1:홍길동
2
3
2.5
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab3_1:오동재");
		
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		double avg = ((double)num1 + (double)num2) / 2;
		System.out.println(avg);
		
		input.close();

	}

}
