package com.ooo.properties.encapsulation1;
public class BankAccount {

    // Public attributes accessible from anywhere
    public String accountHolder;
    public double balance;

    // Protected attribute accessible within the same package and subclasses
    protected String accountNumber;

    // Default (package-private) attribute accessible within the same package
    String bankName;

    // Private attribute accessible only within the same class
    private String pin;

    // Public constructor accessible from anywhere
    public BankAccount(String accountHolder, double initialBalance, String accountNumber, String bankName, String pin) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.pin = pin;
    }

    // Protected method accessible within the same package and subclasses
    protected void celebrateInterest(double interestRate) {
        System.out.println("Interest celebrated for " + accountHolder + "'s account at a rate of " + interestRate + "%");
    }

    // Public method to display basic account information
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Balance: $" + balance);
    }
    
    void getAccountNumber() {
    	System.out.println("AccountNumber"+ accountNumber);
    }
}