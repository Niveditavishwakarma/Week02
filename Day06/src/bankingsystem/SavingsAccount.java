package bankingsystem;
class SavingsAccount extends BankAccount implements Loanable{
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted for Savings Account.");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 0.8;
    }
}

