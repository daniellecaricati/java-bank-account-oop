package bank_account;

import java.util.Scanner;

import bank_account.model.Account;
import bank_account.model.CheckingAccount;
import bank_account.model.SavingsAccount;
import utility.Colors;

public class Menu {
	
	private static final Scanner read = new Scanner(System.in); //Scanner out of main makes it accessible to all 
	
	public static void main(String[] args) {
		
		//Checking Account test
		CheckingAccount cc1 = new CheckingAccount(2, 123, 1, "Fabiana Sena", 0.0f, 1000.0f);
		cc1.display();
		cc1.withdraw(120.0f);
		cc1.display();
		cc1.deposit(5000.0f);
		cc1.display();
		
		//SavingsAccount Test
		SavingsAccount cp1 = new SavingsAccount(3, 123, 2, "Adriana Mendes", 15000.0f, 15);
		cp1.display();
		cp1.withdraw(750.0f);
		cp1.display();
		cp1.deposit(2500.0f);
		cp1.display();
		
		
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
			
			option = read.nextInt();
			
			if (option == 0) {
				System.out.println(Colors.TEXT_PURPLE_BOLD + "\n HighPay Bank - Your future starts here! ");
				about();			
				read.close();
				System.exit(0);
			}
			
			switch (option) {
			case 1: 
				System.out.println(Colors.TEXT_GREEN_BOLD + "Create Account\n");
				break;
			case 2: 
				System.out.println(Colors.TEXT_GREEN_BOLD +"Show All Accounts\n");
				break;
			case 3: 
				System.out.println(Colors.TEXT_GREEN_BOLD +"Search Account by Number\n");
				break;
			case 4: 
				System.out.println(Colors.TEXT_GREEN_BOLD +"Update Account Information\n");
				break;
			case 5: 
				System.out.println(Colors.TEXT_GREEN_BOLD +"Delete Account\n");
				break;
			case 6: 
				System.out.println(Colors.TEXT_GREEN_BOLD +"Withdraw\n");
				break;
			case 7: 
				System.out.println(Colors.TEXT_GREEN_BOLD +"Deposit\n");
				break;
			case 8: 
				System.out.println(Colors.TEXT_GREEN_BOLD +"Transfer Between Accounts\n");
				break;
			default:
				System.out.println(Colors.TEXT_RED_BOLD + "Invalid Option.");
				break;
			}
		}
	}
	
		public static void about() {
			System.out.println("------------------------------------------");
			System.out.println(" Project developed by Danielle Caricati   ");
			System.out.println("------------------------------------------");
			
		}

}
