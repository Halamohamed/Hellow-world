package Lab2;

public class Transaction extends BankAccount {
	
	private final double charge=0.1;
	private final double interest=0.02;
	public int numberOfTransaction=0;
	int amount = 0;
	BankAccount[] bank;
	
	public Transaction(int accountNo, double balance) {
		super(accountNo, balance);
		
		if(deposite(amount))
			numberOfTransaction++;
		
		else if (withdraw(amount))
			numberOfTransaction++;
	}

	public void savingAccount() {
		calculateCharge();
		calculateInterest();
	}

	
	public void currentAccount() {
		calculateCharge();
		calculateInterest();
	}
	
	public void calculateCharge() {
		if(deposite(amount))
			balance= amount*charge + amount;
			else if(withdraw(amount))
				balance=amount*charge + amount;
			
			
	}

	public void calculateInterest() {
		if(deposite(amount))
			balance= amount*interest + amount;
			else if(withdraw(amount))
				balance=amount*interest + amount;
	}

}
