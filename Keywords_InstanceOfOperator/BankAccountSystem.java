class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolderName;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; 
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name       : " + bankName);
            System.out.println("Account Holder  : " + this.accountHolderName);
            System.out.println("Account Number  : " + this.accountNumber);
        } else {
            System.out.println("Invalid object - not a BankAccount instance.");
        }
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Kunj Bhasin", "ACC123");
        BankAccount acc2 = new BankAccount("Disha Gupta", "ACC456");

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();

        System.out.println("\nTotal Accounts Created: " + BankAccount.getTotalAccounts());
    }
}
