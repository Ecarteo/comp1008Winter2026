package BankAccount;

public class week14 {

    // Prints account info — takes a BankAccount as input
    static void printAccountInfo(BankAccount account) {
        System.out.println("Owner: " + account.getOwnerName());
        System.out.println("Balance: $" + account.getBalance());
    }

    // Transfers money between two accounts
    static void transfer(BankAccount from, BankAccount to, double amount) {
        System.out.println("\nTransferring $" + amount + "...");
        from.withdraw(amount);
        to.deposit(amount);
    }

    public static void main(String[] args) {
        // Create objects
        BankAccount alice = new BankAccount("Alice", 1000);
        BankAccount bob   = new BankAccount("Bob", 500);

        // Use your functions
        printAccountInfo(alice);
        printAccountInfo(bob);

        transfer(alice, bob, 200);  // Alice sends Bob $200

        System.out.println("\nAfter transfer:");
        printAccountInfo(alice);
        printAccountInfo(bob);
    }
}

class Plant {
    void grow() {
        System.out.println("The plant is growing.");
    }
}

class Flower extends Plant {
    @Override
    void grow() {
        System.out.println("The flower is growing beautifully.");
    }
}

class Main {
    public static void main(String[] args) {
        Plant p = new Flower(); // Flower object in Plant reference
        p.grow(); // calls Flower's grow() because of runtime polymorphism
    }
}