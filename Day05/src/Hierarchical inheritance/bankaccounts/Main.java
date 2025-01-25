package bankaccounts;

public class Main {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 5000.0, 3.5);
        CheckingAccount checkingAccount = new CheckingAccount("CA67890", 2000.0, 500.0);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FD11223", 10000.0, 12, 11000.0);

        // Display details of each account type
        System.out.println("----- Savings Account -----");
        savingsAccount.displayAccountDetails();
        savingsAccount.displayAccountType();
        System.out.println("Yearly Interest: $" + savingsAccount.calculateYearlyInterest());

        System.out.println("\n----- Checking Account -----");
        checkingAccount.displayAccountDetails();
        checkingAccount.displayAccountType();

        System.out.println("\n----- Fixed Deposit Account -----");
        fixedDepositAccount.displayAccountDetails();
        fixedDepositAccount.displayAccountType();
    }
}
