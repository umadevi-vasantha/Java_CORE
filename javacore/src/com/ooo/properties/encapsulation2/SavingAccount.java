package com.ooo.properties.encapsulation2;

import com.ooo.properties.encapsulation1.BankAccount;

public class SavingAccount extends BankAccount {

	private double interest;

	public SavingAccount(String accountHolder, double initialBalance, String accountNumber, String bankName,
			String pin,double interest) {
		super(accountHolder, initialBalance, accountNumber, bankName, pin);
		// TODO Auto-generated constructor stub
		this.interest=interest;
	}
	
	public static void main(String args[]) {
		SavingAccount account = new SavingAccount("John", 1000.0, "12345", "SomeBank", "4321",10.0);
		//Pin is decalred private - Not accessible out the class
		//System.out.println(account.pin);;
		//Public- Accessible everywhere
		System.out.println(account.accountHolder);
		//Protected - Accessible from same packages and subclassess
		System.out.println(account.accountNumber);
		//Deafult - Accessible from same packages
		//System.out.println(account.bankName);
		//Public methods accessible from everywhere
		account.displayAccountInfo();
		//Default accessible from same package
		//account.getAccountNumber();
		//Protected - Accessible from same packages and subclassess
		account.celebrateInterest(0);
		
		BankAccount account1 = new BankAccount("John", 1000.0, "12345", "SomeBank", "4321");
		//account1.celebrateInterest(0); Not Possible because the refernce is of Superclass
		
		SavingAccount account2 = (SavingAccount) new BankAccount("John", 1000.0, "12345", "SomeBank", "4321");
		account2.celebrateInterest(0);
		
		BankAccount account3 =new BankAccount("John", 1000.0, "12345", "SomeBank", "4321");
		((SavingAccount)account3).celebrateInterest(10);
		//celebrateInterest(10);
		
//Access Through Reference Type:
//
//When accessing protected members through a reference variable of the superclass type, 
//direct access is allowed only if the reference is pointing to an instance of the subclass.
//If the reference is of the superclass type, even if it points to an instance of the subclass, direct access to protected members is not allowed.
//		
//		
	}


}
