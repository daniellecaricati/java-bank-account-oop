package bank_account;

import java.util.InputMismatchException;
import java.util.Scanner;

import bank_account.controller.AccountController;
import bank_account.model.Account;
import bank_account.model.CheckingAccount;
import bank_account.model.SavingsAccount;
import utility.Colors;

public class Menu {
	
	private static final Scanner read = new Scanner(System.in); //Scanner out of main makes it accessible to all 
	private static final AccountController accountController = new AccountController();
	
	public static void main(String[] args) {
		
		int option;
		
		while (true) {
			System.out.println(Colors.TEXT_PURPLE_BRIGHT + Colors.ANSI_BLACK_BACKGROUND + 
					"------------------------------------");
			System.out.println("      Welcome to HighPay Bank       ");
			System.out.println("------------------------------------");
			System.out.println("      1 - Create Account       	    ");
			System.out.println("      2 - Show All Accounts         ");
			System.out.println("      3 - Search Account by Number  ");
			System.out.println("      4 - Update Information        ");
			System.out.println("      5 - Delete Account            ");
			System.out.println("      6 - Withdraw                  ");
			System.out.println("      7 - Deposit                   ");
			System.out.println("      8 - Transfer Between Accounts ");
			System.out.println("      0 - Exit                      ");
			System.out.println("Please enter option number:         ");
			
			try {
			option = read.nextInt();
			read.nextLine();
			}catch(InputMismatchException e) {
				option = -1;
				System.out.println("Enter a positive number!");
				read.nextLine();
			}
			
			if (option == 0) {
				System.out.println(Colors.TEXT_PURPLE_BOLD + "\n HighPay Bank - Your future starts here! ");
				about();			
				read.close();
				System.exit(0);
			}
			
			switch (option) {
			case 1: 
				System.out.println(Colors.TEXT_GREEN_BOLD + "Create Account\n");
				createAccount();
				keyPress();
				break;
			case 2: 
				System.out.println(Colors.TEXT_GREEN_BOLD +"Show All Accounts\n");
				listAll();
				keyPress();
				break;
			case 3: 
				System.out.println(Colors.TEXT_GREEN_BOLD +"Search Account by Number\n");
				keyPress();
				break;
			case 4: 
				System.out.println(Colors.TEXT_GREEN_BOLD +"Update Account Information\n");
				keyPress();
				break;
			case 5: 
				System.out.println(Colors.TEXT_GREEN_BOLD +"Delete Account\n");
				keyPress();
				break;
			case 6: 
				System.out.println(Colors.TEXT_GREEN_BOLD +"Withdraw\n");
				keyPress();
				break;
			case 7: 
				System.out.println(Colors.TEXT_GREEN_BOLD +"Deposit\n");
				keyPress();
				break;
			case 8: 
				System.out.println(Colors.TEXT_GREEN_BOLD +"Transfer Between Accounts\n");
				keyPress();
				break;
			default:
				System.out.println(Colors.TEXT_RED_BOLD + "Invalid Option.");
				keyPress();
				break;
			}
		}
	}
	
		public static void about() {
			System.out.println("------------------------------------------");
			System.out.println(" Project developed by Danielle Caricati   ");
			System.out.println("------------------------------------------");
			
		}
		
		//Method to make the system advance only after the user press enter.
		public static void keyPress() {
			System.out.println(Colors.TEXT_RESET + "\nPress Enter to continue..");
			read.nextLine();
		}
		
		private static void listAll() {
			accountController.listAll();
		}
		
		private static void createAccount() {
			System.out.println("Enter Account Branch Number: ");
			int accountBranch = read.nextInt();
			
			System.out.println("Enter Account Holder Name: ");
			read.skip("\\R");
			String accountHolder = read.nextLine();
			
			System.out.print("Enter Account Type Number (1 - Checking Account | 2 - Savings Account)");
			int accountType = read.nextInt();
			
			System.out.println("Ente the initial account balance: ");
			float balance = read.nextFloat();
			
			switch (accountType) {
			
			case 1 -> {
				System.out.println("Enter the account limit amount: ");
				float limit = read.nextFloat();
				accountController.create(new CheckingAccount(accountController.createNumber(), accountBranch, accountType, accountHolder, balance, limit));
			}
			case 2 -> {
				System.out.println("Enter the account Anniversary Day: ");
				int anniversary = read.nextInt();
				accountController.create(new SavingsAccount(accountController.createNumber(), accountBranch, accountType, accountHolder, balance, anniversary));
			} 
			default -> System.out.println(Colors.TEXT_RED_BOLD + "Invalid Account Type" + Colors.TEXT_RESET);
			}
			
		}
		

}
