package wk10.inheritance_tasks.medium.task20;

public class BankAccount {

    private String bankName;
    private int accountNumber;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount(){}

    public BankAccount(String bankName, int accountNumber) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "You bank with bank "+ bankName +
                ". Your account number is " + accountNumber;

    }
}
