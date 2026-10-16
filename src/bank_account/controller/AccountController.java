package bank_account.controller;

import java.util.ArrayList;
import java.util.List;

import bank_account.model.Account;
import bank_account.repository.AccountRepository;

public class AccountController implements AccountRepository {

	private List<Account> listAccounts = new ArrayList<Account>(); //Collection to store account data during syustem execution, a database simulation
	int number =0;
	
	@Override
	public void listAll() {
		for (var account : listAccounts) { //for each to iterate the collection  . Var is a local variable with automatic type identification.
			account.display();
		}
		
	}

	@Override
	public void create(Account account) {
		listAccounts.add(account);
		System.out.printf("The account number %d has been successfully created!%n", account.getAccountNumber());
		
	}

	@Override
	public void findByNumber(int accountNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int accountNumber) {
		// TODO Auto-generated method stub
		
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
	
	public int createNumber() { //This simulates the primary key function of a database
		return ++ number; 
	}

}
