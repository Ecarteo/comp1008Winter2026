package test1.exercise3;

import java.util.Arrays;

public class BankCard {
    // Variables
    long cardNumber;
    String holderName;
    int[] transactionYears;

    static String regex = "^[A-Za-z ]+$";

    // Main method
    public static void main(String[] args) {

        // Test 1 - valid card creation
        BankCard card = new BankCard(1234567890123456L, "John Doe", new int[]{2022, 2023});
        System.out.println("Test 1 passed: " + (card.getCardNumber() == 1234567890123456L && card.getHolderName().equals("John Doe")));

        // Test 2 - invalid card number throws exception
        try {
            new BankCard(123L, "John Doe");
            System.out.println("Test 2 failed: no exception thrown");
        } catch (IllegalArgumentException e) {
            System.out.println("Test 2 passed: " + e.getMessage());
        }

        // Parameterized test 1 - invalid card numbers
        long[] invalidNumbers = {123L, 12345678901234567L, 0L, -1234567890123456L};
        for (long number : invalidNumbers) {
            try {
                new BankCard(number, "John Doe");
                System.out.println("Test 3 failed for: " + number);
            } catch (IllegalArgumentException e) {
                System.out.println("Test 3 passed for: " + number);
            }
        }

        // Parameterized test 2 - valid card numbers and holder names
        long[] validNumbers = {1234567890123456L, 9999999999999999L, 1000000000000000L};
        String[] validNames = {"John Doe", "Jane Smith", "Alice Brown"};
        for (int i = 0; i < validNumbers.length; i++) {
            BankCard c = new BankCard(validNumbers[i], validNames[i]);
            System.out.println("Test 4 passed for: " + (c.getCardNumber() == validNumbers[i] && c.getHolderName().equals(validNames[i])));
        }
    }

    // Constructor 1
    public BankCard(long cardNumber, String holderName, int[] transactionYears) {
        String cardStr = String.valueOf(cardNumber);
        if (cardStr.length() != 16) throw new IllegalArgumentException("Card number must be exactly 16 digits.");
        if (holderName == null || !holderName.matches(regex))
            throw new IllegalArgumentException("Invalid holder name: " + holderName);
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.transactionYears = transactionYears;
    }

    // Constructor 2
    public BankCard(long cardNumber, String holderName) {
        this(cardNumber, holderName, new int[]{});
    }

    // Debit
    public static BankCard debitCard(long cardNumber, String holderName) {
        return new BankCard(cardNumber, holderName, new int[]{});
    }

    // Credit
    public static BankCard creditCard(long cardNumber, String holderName) {
        return new BankCard(cardNumber, holderName, new int[]{});
    }

    // Getters
    public long getCardNumber() { return cardNumber; }
    public String getHolderName() { return holderName; }
    public int[] getTransactionYears() { return transactionYears; }

    // toString using StringBuilder
    @Override
    public String toString() {
        return new StringBuilder("BankCard{")
        .append("cardNumber=").append(cardNumber)
        .append(", holderName='").append(holderName).append('\'')
        .append(", transactionYears=").append(Arrays.toString(transactionYears))
        .append('}')
        .toString();
    }
}