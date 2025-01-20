public class BankAccountSystem{
	public static void main(String args[])
	{	
		//create bank accounts
		BankAccount account1 = new BankAccount("Alice",1001,5000.00);
		BankAccount account2 = new BankAccount("Bob",1002,3000.00);
		
		//displaying details of Bank accounts
		account1.displayDetails();
		account2.displayDetails();
		
		//display total number of bank accounts
		BankAccount.getTotalAccount();
	}
}
class BankAccount{
	//static variables
	private static String bankName = "National Bank";
	private static int totalAccounts = 0;
	
	//instance variables
	private String accountHolderName;
	private final int accountNumber;
	private double balance;
	
	//constructor
	public BankAccount(String accountHolderName,int accountNumber,double initialBalance)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = initialBalance;
		//count the total number of accounts in the bank
		totalAccounts++;
	}
	
	//method to display total accounts 
	public static void getTotalAccount()
	{
		System.out.println("The total number of accounts in " + bankName + " are: " + totalAccounts);
	}
	
	//method to display bank account details
	public void displayDetails()
	{
		if(this instanceof BankAccount)
		{
			System.out.println("Account Holder name: " + accountHolderName);
			System.out.println("AccountNumber: " + accountNumber);
			System.out.println("Balance: $" + balance);
			System.out.println();
		}
		else{
			System.out.println("Not a valid object of BankAccount");
		}
	}
}
