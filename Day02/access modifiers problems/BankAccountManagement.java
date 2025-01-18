public class BankAccountManagement{
	public static void main(String args[])
	{
        BankAccount account = new BankAccount("123456789", "Alice", 5000);
        System.out.println("Bank Account Details:");
        account.displayAccountDetails();
        System.out.println();

        account.deposit(1500);
        account.withdraw(2000);
        System.out.println("Updated Balance: $" + account.getBalance());
        System.out.println();

        SavingsAccount savings = new SavingsAccount("987654321", "Bob", 10000, 3.5);
        savings.displaySavingsAccountDetails();
        System.out.println();

        System.out.println("Accessing details through the superclass:");
        savings.displayAccountDetails();
    }
}

class BankAccount {
    // Public Variable
    public String accountNumber;

    // Protected Variable
    protected String accountHolder;

    // Private Variable
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
	
    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


