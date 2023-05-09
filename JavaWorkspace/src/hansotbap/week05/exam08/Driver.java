package hansotbap.week05.exam08;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Account> list = new ArrayList<Account>();
		
		list.add(new Account(1234, 10000));
		list.add(new Account(5678, 90000));
		list.add(new Account(3492, 28888));
		
		System.out.print("PIN을 입력하시오: ");
		int pin = sc.nextInt();
		for(Account ac : list) {
			if(ac.getPin() == pin) {
				while(true) {
					System.out.print("""
							-------------------
							1. 현금 입금
							2. 현금 인출
							3. 계좌 이체
							4. 종료
							번호를 선택하세요: 
							""");
					int choice = sc.nextInt();
					switch(choice) {
					case 1:
						System.out.print("입금액: ");
						ac.insert(sc.nextInt());
						System.out.println("현재 잔액은 " + ac.getBalance() + "입니다.");
					case 2:
						System.out.print("인출액: ");
						ac.withdraw(sc.nextInt());
						System.out.println("현재 잔액은 " + ac.getBalance() + "입니다.");
					case 3:
						System.out.print("이체액: ");
						int move = sc.nextInt();
						System.out.print("상대계좌: ");
						for(Account ac2 : list) {
							
						}
					}
				}
			}
		}

	}

}
