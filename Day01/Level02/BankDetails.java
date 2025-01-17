import java.util.Scanner;
public class BankDetails{
	public static void main(String[] args) {
        // Creating a BankAccount object
		Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount("John Doe", "123456789", 5000.0);

        account.displayBalance();
        System.out.println();
		
		System.out.println("Enter amount to deposit: ");
		double amountToDeposit = sc.nextInt();
		account.deposit(amountToDeposit);
        account.displayBalance();
        System.out.println();

		System.out.println("Enter amount to withdrawl: ");
		double amountToWithdrawl = sc.nextInt();
        account.withdrawl(amountToWithdrawl);
        account.displayBalance();
        System.out.println();
        
}
} 
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor 
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdrawl(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawl failed.");
        } else {
            System.out.println("Invalid withdrawl amount.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

    
    

