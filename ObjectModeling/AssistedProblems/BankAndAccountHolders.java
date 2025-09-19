import java.util.ArrayList;

class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account account : accounts) {
            System.out.println("Account " + account.getAccountNumber() + ": " + account.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

class Bank {
    private String bankName;
    private ArrayList<Customer> customers;
    private int nextAccountNumber = 1001;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, double initialDeposit) {
        Account newAccount = new Account(nextAccountNumber++, initialDeposit);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account " + newAccount.getAccountNumber() + " opened for " + customer.getName() + " in " + bankName);
    }

    public void showCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer customer : customers) {
            System.out.println(customer.getName());
        }
    }
}

public class BankAndAccountHolders {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        Customer c1 = new Customer("Kunj");
        Customer c2 = new Customer("Disha");

        bank.openAccount(c1, 5000);
        bank.openAccount(c1, 2000);
        bank.openAccount(c2, 10000);

        c1.viewBalance();
        c2.viewBalance();

        bank.showCustomers();
    }
}
