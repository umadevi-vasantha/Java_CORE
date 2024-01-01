package com.ooo.properties.Inheritance;


class BankAccount{
	String accountNumber;
	String accountHolder;
	double balance;
	
	public BankAccount(String accountNumber, String accountHolder, double balance) {
		this.accountHolder =accountHolder;
		this.accountNumber= accountNumber;
		this.balance=balance;
		System.out.println("New Account Created");
	}
	
	public void displayAccountInfo() {
		System.out.println("Account Holder "+this.accountHolder);
		System.out.println("Account Number "+this.accountNumber);
		System.out.println("Balance Amount "+this.balance);
		
	}
	
	public void withdrawAmount(double amount) {
		if (this.balance >=amount) {
			balance -= amount;
			System.out.println("Withdrawn amount Rs. "+ amount +"Current Balance Amount is Rs."+ balance);
		}
		else {
			System.out.println("Insufficent funds. Withdrawal Failed.Kindly check this balance");
		}
		
	}
}

class SavingsAccount extends BankAccount{
	double interestRate;
	public SavingsAccount(String accountNumber, String accountHolder , double balance, double interestrate) {
		super(accountNumber,accountHolder,balance);
		this.interestRate= interestrate;
		
	}
	
	public void addInterest() {
		double interest = balance * (interestRate/100);
		balance+=interest;
		System.out.println(interest +"added. New Balance is "+ balance);
	}
	
	public SalaryAccount covertToSalaryAccount(double overdraftlimit) {
		SalaryAccount salAcc = new SalaryAccount(this.accountNumber,this.accountHolder,this.balance,overdraftlimit);
		System.out.println("Account is converted into Salary Account");
		salAcc.displayAccountInfo();
		System.out.println("Savings account is closed");
		return salAcc;
				
		
	}
}

class SalaryAccount extends BankAccount{
	double overdraftlimit;
	public SalaryAccount(String accountNumber, String accountHolder, double balance,double overdraftlimit) {
		super(accountNumber,accountHolder,balance);
		this.overdraftlimit=overdraftlimit;
		}
	@Override
	public void withdrawAmount(double amount) {
		if (this.balance + this.overdraftlimit >= amount) {
			balance -=amount;
			System.out.println(amount+"Withdrwan. New Balance is "+ balance);
		}else {
			System.out.println("Overdraft limit is exceeded");
		}
	}
}


public class BankSystem {
	public static void main(String[] args) {
		SavingsAccount savAcc= new SavingsAccount("ACC7830","PRAKRUTHI",5000.0,10);
		savAcc.displayAccountInfo();
		savAcc.withdrawAmount(6000);
		savAcc.addInterest();
		SalaryAccount salAcc = savAcc.covertToSalaryAccount(10000);
		salAcc.withdrawAmount(20000);
		
	}
	
	

}
