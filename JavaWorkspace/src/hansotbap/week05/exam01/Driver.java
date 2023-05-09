package hansotbap.week05.exam01;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount a1 = new BankAccount(10000);
		BankAccount a2 = new BankAccount(0);
		
		System.out.println("a1: " + a1);
		System.out.println("a2: " + a2 + "\n");
		a1.transfer(1000, a2);
		System.out.println("a1: " + a1);
		System.out.println("a2: " + a2);

	}

}
