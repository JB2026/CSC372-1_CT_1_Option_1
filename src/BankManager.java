// A class to test the bank account classes.
public class BankManager {
	public static void main(String[] args) {
		// Create a bank account.
		BankAccount newBankAccount = new BankAccount();
		
		// Create a checking account which inherits from BankAccount.
		CheckingAccount newCheckingAccount = new CheckingAccount();
		
		// Test setting up bank account information.
		System.out.println("Setting up accounts.\n");
		newBankAccount.setFirstName("John");
		newBankAccount.setLastName("Smith");
		newBankAccount.setAccountID(321);
		
		// Test setting up checking account information.
		newCheckingAccount.setFirstName("Mary");
		newCheckingAccount.setLastName("Jones");
		newCheckingAccount.setAccountID(405);
		newCheckingAccount.setInterestRate(0.09);
		
		// Test depositing negative amount into bank account.
		System.out.println("Attempting to deposit -$200 into bank account.\n");
		newBankAccount.deposit(-200);
		
		// Test depositing negative amount into checking account.
		System.out.println("Attempting to deposit -$200 into checking account.\n");
		newCheckingAccount.deposit(-200);
		
		// Output account summaries.
		System.out.println("Getting Account Summaries.\n");
		newBankAccount.accountSummary();
		newCheckingAccount.displayAccount();
		
		// Test depositing amount into bank account.
		System.out.println("Attempting to deposit $450 into bank account.\n");
		newBankAccount.deposit(450);
		
		// Test depositing amount into checking account.
		System.out.println("Attempting to deposit $350 into checking account.\n");
		newCheckingAccount.deposit(350);
		
		// Output account summaries.
		System.out.println("Getting Account Summaries.\n");
		newBankAccount.accountSummary();
		newCheckingAccount.displayAccount();
		
		// Test withdrawing negative amount into bank account.
		System.out.println("Attempting to withdraw -$300 from the bank account.\n");
		newBankAccount.withdrawal(-300);
		
		// Test withdrawing negative amount into checking account.
		System.out.println("Attempting to withdraw -$300 from the checking account.\n");
		newCheckingAccount.processWithdrawal(-300);
		
		// Output account summaries.
		System.out.println("Getting Account Summaries.\n");
		newBankAccount.accountSummary();
		newCheckingAccount.displayAccount();
		
		// Test withdrawing amount into bank account.
		System.out.println("Attempting to withdraw $350 from the bank account.\n");
		newBankAccount.withdrawal(350);
		
		// Test withdrawing amount into checking account.
		System.out.println("Attempting to withdraw $240 from the checking account.\n");
		newCheckingAccount.processWithdrawal(240);
		
		// Test getBalance() for bank account.
		System.out.println("Get the bank account balance.\n");
		System.out.printf("New Balance of Bank Account: $%.2f \n", newBankAccount.getBalance());
		
		// Test getBalance() for checking account.
		System.out.println("\nGet the checking account balance.\n");
		System.out.printf("New Balance of Checking Account: $%.2f \n", newCheckingAccount.getBalance());
		
		// Test overdraft of bank account.
		System.out.println("\nAttempting to withdraw $200 from the bank account.\n");
		newBankAccount.withdrawal(200);
		
		// Test overdraft of checking account.
		System.out.println("Attempting to withdraw $300 from the checking account.");
		newCheckingAccount.processWithdrawal(300);
		
		// Output account summaries.
		System.out.println("\nGetting Account Summaries.\n");
		newBankAccount.accountSummary();
		newCheckingAccount.displayAccount();
	}
}
