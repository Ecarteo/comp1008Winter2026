package wk6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week6 {

    public static void main(String[] args) {
        example7();
    }

    static void example1(){


        Calculator c1 = new Calculator();
        int r1 = c1.add();
        int r2 = c1.add(1, 2);
        double r3 = c1.add(3.3, 4.4);

        System.out.println(c1.getClass().getName());

        System.out.println(c1);

        /* Override:
            throw out the default method behaviouur and implement  new method behaviour. */
    }

    static void example2(){

        int num = Integer.parseInt("1");
        
    }

    static void example3() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num1 = sc.nextInt();
        System.out.println("Enter another integer: ");
        int num2 = sc.nextInt();

        System.out.println(num1 / num2);

    }
    
    static void example4() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        try {
            int num1 = sc.nextInt();
            System.out.println("Enter another integer: ");
            int num2 = sc.nextInt();

            System.out.println(num1 / num2);
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid int number inputted");
        }
        catch (ArithmeticException e) {
            System.err.println("Cannot divide by zero");
        }

        catch (Exception e) {
            // serr+tab
            System.err.println("Error!");

        }

    }

    static void example5() {

        int num = 0;

        while (num == 0){
            try{

                // Ask user to input an even number
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter an even number");
                num = sc.nextInt();
                if (num % 2 == 1){
                    throw new IllegalArgumentException("Odd number inputted!");
                } else if (num == 0) {
                    throw new ArithmeticException("Cannot get the remaindre of  value of number is zero");
                } else if (num < 0) {
                    throw new IllegalArgumentException("Negative number inputted!");
                }
                System.out.println("You've inputted and even number");
            }
            catch (Exception e) {
                System.err.println(e.getClass().getName());
                System.err.println(e.getMessage());
            }
            finally {
                System.out.println("Thank you for using our program");
            }
        }
    }

    static void example7() {



        /*
        {N}        exact N times
        {N,}       at lest N times
        {N, M}      between N and M times
        */
        
        String text = "My number is 311-328-7551";

        Pattern pattern = Pattern.compile("[0-9]{2,}");
        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.matches());

        while  (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    static void example8() {
        // Write a regex that will validate a name in format "First name Last name"
        // No middle names allowed
        String regex = "[A-Za-Z]{2,}\s[a-zA-Z]{3,}";
        String text = "Ma Cal";

        Pattern pattern = Pattern.compile("[0-9]{2,}");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());

        // "\d{1,\.[0-9]{2}" 
    }

    static void example9() {
        // Write a regex that will validate a name in format "First name Last name"
        // No middle names allowed
        String regex = "[a-zA-Z]\\d[a-zA-Z]\\s?\\d[a-zA-Z\\d";
        String text = "L4M 6A6";

        Pattern pattern = Pattern.compile("[0-9]{2,}");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());

        // "\d{1,\.[0-9]{2}" 
    }
}