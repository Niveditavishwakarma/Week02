package bankingsystem;


import java.util.Scanner;
import java.util.*;

public class Main {
    public static void processAccounts(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + " | Holder Name: " + account.getHolderName());

            if (account instanceof Loanable) {
                ((Loanable) account).applyForLoan();
                System.out.println("Loan Eligibility: " + ((Loanable) account).calculateLoanEligibility());
            }

            double interest = account.calculateInterest();
            System.out.println("Interest: " + interest);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("S001", "Alice", 5000, 4));
        accounts.add(new CurrentAccount("C001", "Bob", 2000, 1000));

        for (BankAccount account : accounts) {
            System.out.println("\nProcessing account: " + account.getAccountNumber());
            System.out.print("Enter amount to deposit: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);
        }

        System.out.println("\nCalculating details for all accounts:");
        processAccounts(accounts);

        scanner.close();
    }
}
