// An abstract class that represents a bank account and it's basic functionality.
public abstract class BankAccount {
	// Class properties
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	// Default constructor
	public BankAccount() {
		this.firstName = "";
		this.lastName = "";
		this.accountID = -1;
		this.balance = 0.0;
	}
	
	// A method required by all subclasses to set an interest rate.
	abstract void setInterestRate(double rate);
	
	// A method to set the first name on the bank account.
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// A method to set the last name on the bank account.
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// A method to set the account ID on the bank account.
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	
	// A method to get the first name set for the account.
	public String getFirstName() {
		return this.firstName;
	}
	
	// A method to get the last name set for the account.
	public String getLastName() {
		return this.lastName;
	}
	
	// A method to get the account ID set for the account.
	public int getAccountID() {
		return this.accountID;
	}
	
	// A method to get the balance of the account.
	public double getBalance() {
		return this.balance;
	}
	
	// A method to get the balance formatted for output.
	public String getFormattedBalance() {
		return String.format("$%.2f", this.balance);
	}
	
	// A method that outputs the account's summary.
	public void accountSummary() {
		System.out.println("Account Summary");
		System.out.println("--------------------------------");
		System.out.printf("Account Owner: %s %s\n", firstName, lastName);
		System.out.printf("Account ID: %d\n", accountID);
		System.out.printf("Account Balance: %s\n", getFormattedBalance());
	}
	
	// A method to deposit the passed in amount into the account.
	public void deposit(double depositAmount) {
		// If the deposit amount is negative, inform the user and do not update balance.
		if (depositAmount < 0) {
			System.out.println("The deposit amount was negative, no funds were added. Please try again.\n");
			return;
		}
		
		balance = balance + depositAmount;
	}
	
	// A method to withdraw the passed in amount from the account.
	public void withdrawal(double withdrawalAmount) {
		// If the withdrawal amount is negative, inform the user and do not update balance.
		if (withdrawalAmount < 0) {
			System.out.println("The withdrawal amount was negative, no funds were removed. Please try again.\n");
			return;
		}
		
		balance = balance - withdrawalAmount;
	}
}