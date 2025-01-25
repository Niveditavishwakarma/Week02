package bankaccounts;

public class BankAccount {
        protected String accountNumber;
        protected double balance;

        // Constructor
        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void displayAccountDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }

        public void displayAccountType() {
            System.out.println("Generic Bank Account");
        }
    }

