package wk10.inheritance_tasks.medium.task20;

public class Runner {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("MyBank", 12345);

        CheckingAccount checkingAccount = new CheckingAccount(bankAccount, 2, 1000);

        System.out.println(checkingAccount);

        checkingAccount.deposit(-100);
        System.out.println(checkingAccount.getBalance());

        checkingAccount.deposit(100);
        System.out.println(checkingAccount.getBalance());

        checkingAccount.withdraw(100);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.withdraw(300);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.withdraw(400);
        System.out.println(checkingAccount.getBalance());


    }
}
