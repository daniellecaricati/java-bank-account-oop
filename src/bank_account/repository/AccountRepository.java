package bank_account.repository;

import bank_account.model.Account;

public interface AccountRepository {
	
	//CRUD Account
	public void listAll();
	public void create(Account account);
	public void findByNumber(int accountNumber);
	public void update(Account account);
	public void delete(int accountNumber);
	
	//Banking Operations
	public void withdraw(int accountNumber, float amount);
	public void deposit(int accountNumber, float amount);
	public void transfer(int sourceAccountNumber, int destinationAccountNumber, float amount);
}
