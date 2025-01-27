package Proj1;

import java.util.Scanner;

//Console-based application to simulate simple banking operations. 

public class BasicBankingApplication {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create sample accounts
	        BankAccount account1 = new BankAccount("Alice", 5000);
	        BankAccount account2 = new BankAccount("Bob", 3000);

	        System.out.println("Welcome to the Banking Application!\n");

	        while (true) {
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit Money");
	            System.out.println("3. Withdraw Money");
	            System.out.println("4. Transfer Money");
	            System.out.println("5. Exit\n");
	            System.out.print("Select an option: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Your current balance is: Rs. " + account1.getBalance());
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: Rs. ");
	                    double depositAmount = scanner.nextDouble();
	                    account1.deposit(depositAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter amount to withdraw: Rs. ");
	                    double withdrawAmount = scanner.nextDouble();
	                    account1.withdraw(withdrawAmount);
	                    break;
	                case 4:
	                    System.out.print("Enter amount to transfer: Rs. ");
	                    double transferAmount = scanner.nextDouble();
	                    account1.transfer(account2, transferAmount);
	                    break;
	                case 5:
	                    System.out.println("Thank you for using the Banking Application. Goodbye!");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	            System.out.println();
	        }
	    }
}
