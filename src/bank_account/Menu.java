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
		
		createAccountTest(); 
		
		int option; //variable for menu
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
				findAccountByNumber();
				keyPress();
				break;
			case 4: 
				System.out.println(Colors.TEXT_GREEN_BOLD +"Update Account Information\n");
				updateAccount();
				keyPress();
				break;
			case 5: 
				System.out.println(Colors.TEXT_GREEN_BOLD +"Delete Account\n");
				deleteAccount();
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
		//about - information method
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
		
		//list all method
		private static void listAll() {
			accountController.listAll();
		}
		
		//Method to create account
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
		
		//method create to have data to show when executing listall()
		public static void createAccountTest() {
			accountController.create(new CheckingAccount(accountController.createNumber(), 123, 1, "Danielle Caricati", 10000.0f, 150.00f));
			accountController.create(new CheckingAccount(accountController.createNumber(), 456, 1, "Adriana Mendes", 20000.0f, 200.0f));
			accountController.create(new SavingsAccount(accountController.createNumber(), 789, 2, "Isabel de Fatima", 15000.0f, 12));
			accountController.create(new SavingsAccount(accountController.createNumber(), 004, 2, "Fabiana Mendes", 13000.0f, 20));
		}	
		
		//method to find by number
		private static void findAccountByNumber() {
			System.out.println("Enter the Account Number you want to find: ");
			int accountNumber = read.nextInt();
			accountController.findByNumber(accountNumber);
		}
		
		//method to update account
		private static void updateAccount() {
			System.out.print("Enter Account Number you want to update: ");
			int accountNumber = read.nextInt();
			read.nextLine();
			
			Account account = accountController.searchCollection(accountNumber);
			if (account != null) {
				int accountBranch = account.getAccountBranch();
				String accountHolder = account.getAccountHolder();
				float balance = account.getBalance();
				int accountType = account.getAccountType();
				
				System.out.printf("Account Branch: %d\nNew Account Branch (Press Enter to confirm): ", accountBranch);
				String enter = read.nextLine();
				accountBranch = enter.isEmpty() ? accountBranch : Integer.parseInt(enter);
				
				System.out.printf("Account Holder: %s\nNew Account Holder (Press Enter to confirm): ", accountHolder);
				enter = read.nextLine();
				accountHolder = enter.isEmpty() ? accountHolder : enter;
				
				System.out.printf("Balance: $ %.2f\nNew Balance (Press Enter to confirm): ", balance);
				enter = read.nextLine();
				balance = enter.isEmpty() ? balance : Float.parseFloat(enter.replace(',','.'));
				
				switch (accountType) {
				case 1 -> {
					float limit = ((CheckingAccount) account).getLimit();
					System.out.printf("Limit: $ %.2f\nNew Limit (Press Enter to confirm):", limit);
					enter = read.nextLine();
					limit = enter.isEmpty() ? limit : Float.parseFloat(enter.replace(',','.'));
					accountController.update(new CheckingAccount(accountNumber, accountBranch, accountType, accountHolder, balance, limit ));
				}
				case 2 -> {
					int anniversary = ((SavingsAccount) account).getAnniversary();
					System.out.printf("Anniversary Day: %d\nNew Anniversary Day (Press Enter to confirm): ", anniversary);
					enter = read.nextLine();
					anniversary = enter.isEmpty() ? anniversary : Integer.parseInt(enter);
					accountController.update(new SavingsAccount(accountNumber, accountBranch, accountType, accountHolder, balance, anniversary));
				}
				default -> System.out.println(Colors.TEXT_RED_BOLD + "Invalid Account Type" + Colors.TEXT_RESET);
				}
			} else {
				System.out.printf("\nAccount Number %d has not been found" + accountNumber);
			}	
		}
		
		private static void deleteAccount() {
			System.out.print("Enter the Account Number you want to delete: ");
			int accountNumber = read.nextInt();
			read.nextLine();
			
			System.out.print("Are you sure you want to delete this account? (S/N): ");
			String confirmation = read.nextLine();
			
			if (confirmation.equalsIgnoreCase("S")) {
				accountController.delete(accountNumber);
			} else {
				System.out.println("\nOperation Cancelled.");
			}
		}

}
