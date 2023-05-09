package hansotbap.week05.exam01;

public class BankAccount {
	
	private int balance;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return String.format("BankAccount [balance=%d]", balance);
	}
	
	public void transfer(int amount, BankAccount otherAccount) {
		this.setBalance(this.getBalance() - amount);
		otherAccount.setBalance(otherAccount.getBalance() + amount);
	}
	
}
