package hansotbap.week05.exam08;

import hansotbap.week05.exam01.BankAccount;

public class Account {

	private int pin;
	private int balance;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(int pin, int balance) {
		this.pin = pin;
		this.balance = balance;
	}
	
	public void transfer(int amount, BankAccount otherAccount) {
		balance -= amount;
		otherAccount.setBalance(otherAccount.getBalance() + amount);
	}
	
	public void insert(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}

}
