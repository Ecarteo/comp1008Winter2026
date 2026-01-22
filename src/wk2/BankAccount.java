package wk2;

public class BankAccount {

    /*

    Attributes
    account type: Checking or Savings
    tracks number of deposits and withdrawals
    balance amount that cannot be low zero dollars
    */
    private String accountType;
    private int numDeposits, numWithdrawals;
    private double balance;

/*
Actions
    constructor: set account type and balance
    withdraw(double amount) => balance cannot go below zero dollars. Increase number of withdrawals tracker
    deposit(double amount) => increase number of deposits tracker
    getBalance => return balance
    getNumberDeposits
    getNumberofWithdrawals

     */
    public BankAccount(){}
    public BankAccount(String accountType, double balance){
        //call on methods to evaluate accountType and balance

        setAccountType(accountType);
        setBalance(balance);
    }

    //alt+insert
    // or
    // right-click => Generate

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        if(accountType.equalsIgnoreCase("checking")
                ||
                accountType.equalsIgnoreCase("savings")){

            this.accountType = accountType;
        }
    }

    public int getNumDeposits() {
        return numDeposits;
    }

    public void setNumDeposits(int numDeposits) {
        this.numDeposits = numDeposits;
    }

    public int getNumWithdrawals() {
        return numWithdrawals;
    }

    public void setNumWithdrawals(int numWithdrawals) {
        this.numWithdrawals = numWithdrawals;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0)
            this.balance = balance;
    }

    public void deposit(double amount){
        setBalance(getBalance() + amount);
        setNumDeposits(getNumDeposits() + 1);
    }
    public void withdraw(double amount){

        if(getBalance() - amount >= 0){
            setBalance(getBalance() - amount);
            setNumWithdrawals(getNumWithdrawals() + 1);
        }

    }

}
