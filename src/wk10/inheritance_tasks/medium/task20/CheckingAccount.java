package wk10.inheritance_tasks.medium.task20;

public class CheckingAccount extends BankAccount {


    private int transactionsLimit = 3;
    private int transactionsMade;
    private final double feePerTransactionOverLimit = 0.1;
    private double balance;

    public CheckingAccount(){}

    public CheckingAccount(BankAccount account) {
       // super(account.getBankName(), account.getAccountNumber());

        this(account.getBankName(), account.getAccountNumber(), 3, 0);
    }
    public CheckingAccount(BankAccount account, int transactionsLimit, double balance) {
//        this(account);
//        this.transactionsLimit = transactionsLimit;
//        this.balance = balance;

        this(account.getBankName(), account.getAccountNumber(), transactionsLimit, balance);
    }
    public CheckingAccount(String bankName, int accountNumber, int transactionsLimit, double balance) {
        super(bankName, accountNumber);
        this.transactionsLimit = transactionsLimit;
        this.balance = balance;
    }
    private boolean isNegativeAmount(double amount) {

            return amount < 0;
    }

    public void deposit(double amount) {

        if (isNegativeAmount(amount))
            return;

        this.balance += amount;
    }
    public void withdraw(double amount) {

        if (isNegativeAmount(amount))
            return;

        if(balance - amount >= 0){

            this.balance -= amount;
            transactionsMade++;
            if(transactionsMade > transactionsLimit) {
                this.balance -= feePerTransactionOverLimit;
            }

        }
    }
    public double getBalance() {
        return balance;
    }
}
