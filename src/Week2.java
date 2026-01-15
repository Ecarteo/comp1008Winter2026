

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your text:");
        String text = input.nextLine();

        int upper = 0, lower = 0, num = 0, sym = 0;

        // Using a standard loop and charAt is very common for beginners
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Checking ranges of characters (standard 1st semester logic)
            if (c >= 'A' && c <= 'Z') {
                upper++;
            } else if (c >= 'a' && c <= 'z') {
                lower++;
            } else if (c >= '0' && c <= '9') {
                num++;
            } else {
                sym++;
            }
        }

        if (upper >= 1 && lower >= 1 && num >= 1 && sym >= 1) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Password is missing requirements.");
        }
    }
}

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess = 0;

        // Simple while loop logic
        while (guess != 5) {
            System.out.print("Enter a number (1-10): ");
            guess = input.nextInt();

            if (guess == 5) {
                System.out.println("You got it!");
            } else {
                System.out.println("Wrong, try again.");
            }
        }
    }
}