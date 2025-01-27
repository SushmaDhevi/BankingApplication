package Proj1;

//Console-based application to Allow users to check balance, deposit, and withdraw money.

public class BankAccount {
	    private String accountHolder;
	    private double balance;

	    public BankAccount(String accountHolder, double initialBalance) {
	        this.accountHolder = accountHolder;
	        this.balance = initialBalance;
	    }

	    public String getAccountHolder() {
	        return accountHolder;
	    }

	    //Check balance
	    public double getBalance() {
	        return balance;
	    }

	    //Deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Amount deposited successfully.");
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    //Withdraw money
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Amount withdrawn successfully.");
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance.");
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

	    //Transfer money between accounts
	    public void transfer(BankAccount targetAccount, double amount) {
	        if (amount > 0 && amount <= balance) {
	            this.withdraw(amount);
	            targetAccount.deposit(amount);
	            System.out.println("Amount transferred successfully to " + targetAccount.getAccountHolder() + "'s account.");
	        } else {
	            System.out.println("Transfer failed. Check the amount and balance.");
	        }
	    }
}
