package bank_account;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int option;
		
		while (true) {
			System.out.println("------------------------------------");
			System.out.println("      Welcome to HighPay Bank       ");
			System.out.println("------------------------------------");
			System.out.println("	  1 - Create Account       	    ");
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
				System.out.println("\n HighPay Bank - Your future starts here! ");
				about();			
				read.close();
				System.exit(0);
			}
			
			switch (option) {
			case 1: 
				System.out.println("Create Account\n");
				break;
			case 2: 
				System.out.println("Show All Accounts\n");
				break;
			case 3: 
				System.out.println("Search Account by Number\n");
				break;
			case 4: 
				System.out.println("Update Account Information\n");
				break;
			case 5: 
				System.out.println("Delete Account\n");
				break;
			case 6: 
				System.out.println("Withdraw\n");
				break;
			case 7: 
				System.out.println("Deposit\n");
				break;
			case 8: 
				System.out.println("Transfer Between Accounts\n");
				break;
			default:
				System.out.println("Invalid Option.");
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
