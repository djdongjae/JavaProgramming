package hansotbap.week05.exam06;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Contacts> array = new ArrayList<Contacts>();
		
		System.out.println("연락처를 입력하시오(종료 -1)");
		System.out.print("이름과 전화번호, 이메일을 입력하시오: ");
		
		while (true) {
			String str = input.nextLine();
			if (str.equals("-1")) {
				break;
			} else {
				String[] strArray = str.split(" ");
				array.add(new Contacts(strArray[0], strArray[1], strArray[2]));
				System.out.print("이름과 전화번호, 이메일을 입력하시오: ");
			}
		}
		
		System.out.println("지인들의 수는 " + Contacts.count + "입니다");
		
		System.out.print("검색할 이름을 입력하시오: ");
		String name = input.next();
		for(Contacts contact : array) {
			if(contact.getName().equals(name)) {
				System.out.println(name + "의 전화번호: " + contact.getTel() + " 이메일: " + contact.getEmail());
			}
		}

	}

}
