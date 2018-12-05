package Lab2;

import java.util.Date;

public class BankAccount implements BankInt {
	private int accountNo;
	public double balance;
	public int numberOfTransaction;
	private Date date;
	private boolean active = true;

	public BankAccount(int accountNo, double balance) {
		super();
		setAccountNo(accountNo);
		setBalance(balance);
		date = new Date();
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public boolean isActive() {
		return active;
	}

	public void changeActive() {
		active = !active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean deposite(int amount) {
		if (active && balance > 0) {
			date = new Date();
			balance = balance + amount;
			return true;
		} else
			System.out.println("check your account and balance");
		return false;

	}

	public boolean withdraw(int amount) {
		if (active && balance > amount) {
			date = new Date();
			balance = balance - amount;
			return true;
		} else
			System.out.println("check your account and balance");
		return false;
	}

	public double update() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
