package BankAccount;

public class BankAccount {
    private double balance;
    private String ownerName;

    // Constructor — sets up the account
    public BankAccount(String ownerName, double startingBalance) {
        this.ownerName = ownerName;
        this.balance = startingBalance;
    }

    public String getOwnerName() { return ownerName; }
    public double getBalance()   { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}