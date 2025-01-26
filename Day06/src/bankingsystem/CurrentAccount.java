package bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable{
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current accounts
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted for Current Account.");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit;
    }
}
