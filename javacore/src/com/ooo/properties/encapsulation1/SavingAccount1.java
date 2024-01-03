package com.ooo.properties.encapsulation1;

public class SavingAccount1 extends BankAccount{
	private double interest;

	public SavingAccount1(String accountHolder, double initialBalance, String accountNumber, String bankName,
			String pin) {
		super(accountHolder, initialBalance, accountNumber, bankName, pin);
		// TODO Auto-generated constructor stub
		this.interest=interest;
	}
	
	public static void main(String args[]) {
		BankAccount account = new BankAccount("Uma",89099,"78292","BANK_X","8929");
		//Pin is decalred private - Not accessible out the class
		//System.out.println(account.pin);;
		//Public- Accessible everywhere
		System.out.println(account.accountHolder);
		//Protected - Accessible from same packages and subclassess
		System.out.println(account.accountNumber);
		//Deafult - Accessible from same packages
		System.out.println(account.bankName);
		//Public methods accessible from everywhere
		account.displayAccountInfo();
		//Default accessible from same package
		account.getAccountNumber();
		//Protected - Accessible from same packages and subclassess
		account.celebrateInterest(0);
	}

}
