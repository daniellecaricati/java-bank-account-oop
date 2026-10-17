package bank_account.controller;

import java.util.ArrayList;
import java.util.List;

import bank_account.model.Account;
import bank_account.repository.AccountRepository;

public class AccountController implements AccountRepository {

	private List<Account> listAccounts = new ArrayList<Account>(); //Collection to store account data during syustem execution, a database simulation
	int accountNumber = 0;
	
	@Override
	public void listAll() {
		for (var account : listAccounts) { //for each to iterate the collection  . Var is a local variable with automatic type identification.
			account.display();
		}
		
	}

	@Override
	public void create(Account account) { //Account-class, object- account . This method creates an object account from the Account class
		listAccounts.add(account);//the object is stored in listAccount Collection
		System.out.printf("The account number %d has been successfully created!%n", account.getAccountNumber());
		
	}

	@Override
	public void findByNumber(int accountNumber) {
		var account = searchCollection(accountNumber);
		if (account != null) {
			account.display();
		}else {
			System.out.printf("The account number: %d has not been found!%n", accountNumber);
		}
		
	}

	@Override
	public void update(Account account) {
		var findAccount = searchCollection(account.getAccountNumber()); //findaccount is local variable to verify if the account exists before updating it
		if (findAccount != null) {
			listAccounts.set(listAccounts.indexOf(findAccount), account); //set makes it update the listAccounts
			System.out.printf("The account number %d has been successfully updated!%n", account.getAccountNumber());		
		}else { 
			System.out.printf("The account number: %d has not been found!%n", accountNumber);
		}
		
	}

	@Override
	public void delete(int accountNumber) {
		var account = searchCollection(accountNumber);
		if (account != null) { // to check if account exists, before deleting. 
			if(listAccounts.remove(account) == true) {
				System.out.printf("The Account Number: %d has been successfully deleted.%n", accountNumber);
			}
		}else {
			System.out.printf("The Account Number: %d has not been found!%n", accountNumber );
		}
		
	}

	@Override
	public void withdraw(int accountNumber, float amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(int accountNumber, float amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(int sourceAccountNumber, int destinationAccountNumber, float amount) {
		// TODO Auto-generated method stub
		
	}
	
	//Method that simulates the primary key function of a database
	public int createNumber() { 
		return ++ accountNumber; 
	}
	
	//Method to search the collection of data stored in ListAccounts, and if number found, return the number. 
	public Account searchCollection(int accountNumber) {
		for (var account : listAccounts) {
			if (account.getAccountNumber() == accountNumber) {
				return account;
			}		
		} return null;
	}
}
