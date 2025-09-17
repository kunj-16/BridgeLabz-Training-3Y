class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + String.format("%.2f", balance));
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Daily Withdrawal Limit: $" + String.format("%.2f", withdrawalLimit));
    }
}

class FixedDepositAccount extends BankAccount {
    private int tenureYears;

    public FixedDepositAccount(String accountNumber, double balance, int tenureYears) {
        super(accountNumber, balance);
        this.tenureYears = tenureYears;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Tenure: " + tenureYears + " years");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("S-101", 5000.00, 0.025);
        CheckingAccount checking = new CheckingAccount("C-201", 1500.00, 500.00);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("F-301", 10000.00, 5);

        System.out.println("--- Savings Account Details ---");
        savings.displayAccountType();
        savings.displayAccountDetails();

        System.out.println("\n--- Checking Account Details ---");
        checking.displayAccountType();
        checking.displayAccountDetails();

        System.out.println("\n--- Fixed Deposit Account Details ---");
        fixedDeposit.displayAccountType();
        fixedDeposit.displayAccountDetails();
    }
}