package bank_account.model;

public abstract class Account { //Abstract makes this class only available for inheritance
		//Attributes
		private int accountNumber;
		private int accountBranch;
		private int accountType;
		private String accountHolder;
		private float balance;
		
		//Constructor
		public Account(int accountNumber, int accountBranch, int accountType, String accountHolder, float balance) {
			this.accountNumber = accountNumber;
			this.accountBranch = accountBranch;
			this.accountType = accountType;
			this.accountHolder = accountHolder;
			this.balance = balance;
		}
		
		//Get - Search/Access , Set - Update
		public int getAccountNumber() {
			return accountNumber;
		}
		
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		
		public int getAccountBranch() {
			return accountBranch;
		}
		
		public void setAccountBranch(int accountBranch) {
			this.accountBranch = accountBranch;
		}
		
		public int getAccountType() {
			return accountType;
		}
		
		public void setAccountType(int accountType) {
			this.accountType = accountType;
		}
		
		public String getAccountHolder() {
			return accountHolder;
		}
		
		public void setAccountHolder(String accountHolder) {
			this.accountHolder = accountHolder;
		}
		
		public float getBalance() {
			return balance;
		}
		
		public void setBalance(float balance) {
			this.balance = balance;
		}
		
		//Extra Methods //
		//Withdraw 
		public boolean withdraw(float amount) {
			if (this.balance < amount) {
				return false;
			}
			this.balance = this.balance - amount;
			return true;
		}
		
		// Deposit
		public void deposit(float amount) {
			this.balance = this.balance + amount;
		}
		
		public void display() {
			
			String accountType = "";
			
			switch(this.accountType) {
			case 1:
				accountType = "Checking Account";
				break;
			case 2:
				accountType = "Savings Account";
				break;
			}
			
			System.out.println("-----------------------------");
			System.out.println("Bank Account Information: ");
			System.out.println("Account Number: " + this.accountNumber);
			System.out.println("Account Branch: " + this.accountBranch);
			System.out.println("Account Type: " + accountType);
			System.out.println("Account Holder: " + this.accountHolder);
			System.out.println("Account Balance: " + this.balance);
		}
		
}
