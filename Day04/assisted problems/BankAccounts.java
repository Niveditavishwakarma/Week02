import java.util.ArrayList;
public class BankAccounts {
    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        bank.openAccount(customer1, 500.0);
        bank.openAccount(customer1, 1000.0);
        bank.openAccount(customer2, 750.0);

        customer1.viewBalances();
        customer2.viewBalances();
    }
}

// Customer class
class Customer {
    private String name;
    private ArrayList<Double> accountBalances;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accountBalances = new ArrayList<>();
    }

    // Getter for customer name
    public String getName() {
        return name;
    }

    // Add a new account with an initial deposit
    public void addAccount(double initialDeposit) {
        accountBalances.add(initialDeposit);
        System.out.println("New account opened for " + name + " with initial deposit: $" + initialDeposit);
    }

    // View balances for all accounts
    public void viewBalances() {
        System.out.println("Balances for " + name + ":");
        for (int i = 0; i < accountBalances.size(); i++) {
            System.out.println("Account " + (i + 1) + ": $" + accountBalances.get(i));
        }
    }
}

// Bank class
class Bank {
    private String name;
    private ArrayList<Customer> customers;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Add a customer to the bank
    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer " + customer.getName() + " added to " + name);
    }

    // Open an account for a customer
    public void openAccount(Customer customer, double initialDeposit) {
        if (customers.contains(customer)) {
            customer.addAccount(initialDeposit);
        } else {
            System.out.println("Customer " + customer.getName() + " is not registered with " + name);
        }
    }

    // Display all customers
    public void displayCustomers() {
        System.out.println("Customers of " + name + ":");
        for (Customer customer : customers) {
            System.out.println("- " + customer.getName());
        }
    }
}

