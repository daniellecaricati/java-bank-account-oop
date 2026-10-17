package bank_account.model;

public class SavingsAccount extends Account{
	
	private int anniversary; 
	
	public SavingsAccount(int accountNumber, int accountBranch, int accountType, String accountHolder, float balance, int anniversary) {
		super(accountNumber, accountBranch, accountType, accountHolder, balance);
		this.anniversary = anniversary;
	}
	
	public int getAnniversary() {
		return anniversary;
	}
	
	public void setAnniversary(int anniversary) {
		this.anniversary = anniversary;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Account Anniversary Day: " + this.anniversary);
	}
	
	
}
