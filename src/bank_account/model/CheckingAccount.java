package bank_account.model;

public class CheckingAccount extends Account{

	//Add Attributes of Checking Account
	private float limit;
	
	public CheckingAccount(int accountNumber, int accountBranch, int accountType, String accountHolder, float balance, float limit) {
		super(accountNumber, accountBranch, accountType, accountHolder, balance); //References the super class
		this.limit = limit;	//constructor for this class
	}

	public float getLimit() {
		return limit;
	}

	public void setLimit(float limit) {
		this.limit = limit;
	}
	
	@Override
	public boolean withdraw(float amount) {
		if (this.getBalance() + this.getLimit() < amount) {
			System.out.println("\nInsufficient Balance!");
			return false;
		}
		this.setBalance(this.getBalance() - amount);
		return true;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Credit Limit: " + limit);
	}
	

}
