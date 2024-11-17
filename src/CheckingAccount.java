// A class that represents a checking account and it's basic functionality. It extends the BankAccount class.
public class CheckingAccount extends BankAccount {		
	// Class properties
	private double interestRate;

	// Default constructor
	public CheckingAccount() {
		// Setting to average interest rate.
		this.interestRate = 0.07;
	}

	// A method to set the interest rate.
	public void setInterestRate(double rate) {
		this.interestRate = rate;
	}

	// A method to get the interest rate formatted for output.
	public String getFormattedInterestRate() {
		return String.format("Interest Rate: %.1f\n", (interestRate * 100));
	}

	// A method to output the account summary information.
	public void displayAccount() {
		System.out.print("\nChecking ");
		super.accountSummary();
		System.out.println(getFormattedInterestRate());
	}

	// A method that takes a withdrawal amount and takes it out of the account.
	public void processWithdrawal(double withdrawal) {
		withdrawal(withdrawal);

		// If the balance is now negative, there was an overdraft and a $30 overdraft fee needs to be applied.
		if (getBalance() < 0) {
			withdrawal(30.0);

			// Inform the user that there was an overdraft fee.
			System.out.printf("\nThere was not enough money in your account and a $30 overdraft fee was included. New Balance: %.2f.", getBalance());
			System.out.println();
		}
	}
}