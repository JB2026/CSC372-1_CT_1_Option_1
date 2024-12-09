// A class to test the bank account classes.
public class BankManager {
	public static void main(String[] args) {
		// Create a bank account.
		BankAccount firstCheckingAccount = new CheckingAccount();
		
		// Create a checking account which inherits from BankAccount.
		CheckingAccount secondCheckingAccount = new CheckingAccount();
		
		// Test setting up bank account information.
		System.out.println("Setting up accounts.\n");
		firstCheckingAccount.setFirstName("John");
		firstCheckingAccount.setLastName("Smith");
		firstCheckingAccount.setAccountID(321);
		
		// Test setting up checking account information.
		secondCheckingAccount.setFirstName("Mary");
		secondCheckingAccount.setLastName("Jones");
		secondCheckingAccount.setAccountID(405);
		secondCheckingAccount.setInterestRate(0.09);
		
		// Test depositing negative amount into bank account.
		System.out.println("Attempting to deposit -$200 into bank account.\n");
		firstCheckingAccount.deposit(-200);
		
		// Test depositing negative amount into checking account.
		System.out.println("Attempting to deposit -$200 into checking account.\n");
		secondCheckingAccount.deposit(-200);
		
		// Output account summaries.
		System.out.println("Getting Account Summaries.\n");
		firstCheckingAccount.accountSummary();
		secondCheckingAccount.displayAccount();
		
		// Test depositing amount into bank account.
		System.out.println("Attempting to deposit $450 into bank account.\n");
		firstCheckingAccount.deposit(450);
		
		// Test depositing amount into checking account.
		System.out.println("Attempting to deposit $350 into checking account.\n");
		secondCheckingAccount.deposit(350);
		
		// Output account summaries.
		System.out.println("Getting Account Summaries.\n");
		firstCheckingAccount.accountSummary();
		secondCheckingAccount.displayAccount();
		
		// Test withdrawing negative amount into bank account.
		System.out.println("Attempting to withdraw -$300 from the bank account.\n");
		firstCheckingAccount.withdrawal(-300);
		
		// Test withdrawing negative amount into checking account.
		System.out.println("Attempting to withdraw -$300 from the checking account.\n");
		secondCheckingAccount.processWithdrawal(-300);
		
		// Output account summaries.
		System.out.println("Getting Account Summaries.\n");
		firstCheckingAccount.accountSummary();
		secondCheckingAccount.displayAccount();
		
		// Test withdrawing amount into bank account.
		System.out.println("Attempting to withdraw $350 from the bank account.\n");
		firstCheckingAccount.withdrawal(350);
		
		// Test withdrawing amount into checking account.
		System.out.println("Attempting to withdraw $240 from the checking account.\n");
		secondCheckingAccount.processWithdrawal(240);
		
		// Test getBalance() for bank account.
		System.out.println("Get the bank account balance.\n");
		System.out.printf("New Balance of Bank Account: $%.2f \n", firstCheckingAccount.getBalance());
		
		// Test getBalance() for checking account.
		System.out.println("\nGet the checking account balance.\n");
		System.out.printf("New Balance of Checking Account: $%.2f \n", secondCheckingAccount.getBalance());
		
		// Test overdraft of bank account.
		System.out.println("\nAttempting to withdraw $200 from the bank account.\n");
		firstCheckingAccount.withdrawal(200);
		
		// Test overdraft of checking account.
		System.out.println("Attempting to withdraw $300 from the checking account.");
		secondCheckingAccount.processWithdrawal(300);
		
		// Output account summaries.
		System.out.println("\nGetting Account Summaries.\n");
		firstCheckingAccount.accountSummary();
		secondCheckingAccount.displayAccount();
	}
}
