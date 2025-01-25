package bankaccounts;

public class FixedDepositAccount extends BankAccount{
    private int depositTerm;
    private double maturityAmount;

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm, double maturityAmount) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
        this.maturityAmount = maturityAmount;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Term: " + depositTerm + " months");
        System.out.println("Maturity Amount: $" + maturityAmount);
    }
}
