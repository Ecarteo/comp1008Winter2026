package wk2;
import java.util.Scanner;
public class Week2 {

    static Scanner input = new Scanner(System.in);


    //main+tab
    public static void main(String[] args) {

        //makingDecisions2();
        //System.out.println(validateWholeNumberValue("100abc"));
        usingCalculator();
   }
   static void usingCalculator(){

        //ask the user for a number
       //ask the user for an operator
       //ask the user for another number
       //Call on Calculator class
       //return the result of the calculation

       System.out.println("Enter a number");
       String num1 = input.nextLine();
       System.out.println("Enter an operator");
       String op = input.nextLine();
       System.out.println("Enter another number");
       String num2 = input.nextLine();

       Calculator c1 = new Calculator(num1, op.charAt(0), num2);
       System.out.println(c1.getNum1());
       System.out.println(c1.getNum2());
       System.out.println(c1.getOperator());
       System.out.println(c1.getResult());

       //c1.
   }
    static boolean validateWholeNumberValue(String value){

        //foreach loop in Java aka Enhanced For Loop
        //for(datatype placeHolder : collectionOfValues)

        for(char c : value.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }

        return true;
    }

    static void makingDecisions(){
        //create a program that ask user for age
        //outputs which age category they belong to
        // < 5 => enfant
        // 5-12 => child
        // 13-17 => teen
        //18-64 => adult
        // 65+ => senior
        //using both if statements and switch statements

        System.out.println("Enter your age: ");
        String answer = input.nextLine();  //gets the input as a string
        if(!validateWholeNumberValue(answer)){
            //serr+tab
            System.err.println("Invalid age inputted");
            return;  //end the method execution
        }
        int age = Integer.parseInt(answer);

        if(age < 5) System.out.println("Enfant");
        else if(age < 13)
            System.out.println("Child");
        else if (age < 18) {
            System.out.println("Teen");
        }
        else if (age < 65) System.out.println("Adult");
        else{
            System.out.println("Elder");
        }
        System.out.println( "*".repeat(10) );
        System.out.println("**********");
        System.out.println("I Love Java! ".repeat(100));
        "hi".repeat(100);
       }

    static void makingDecisions2(){

        //ask the user for their age category
        //output their age range

        System.out.println("Enter age category: ");
        String answer = input.nextLine();

        String result = switch (answer.toLowerCase()){
            case "enfant" -> "0-4";
            case "child" -> "5-12";
            case "teen" -> "13-17";
            case "adult" -> "18-64";
            case "elder" -> "65+";
            default -> "unknown";
        };
        System.out.printf("Based on your age category of %s, your age range is %s\n", answer, result);
    }

    static void task1(){

        System.out.println("Enter password: ");
        String answer = input.nextLine();

        int countNum = 0, countUpper = 0, countLower =0, countSpecial = 0;

        for(int i = 0; i < answer.length(); i++){

            if(Character.isLowerCase(answer.charAt(i))) countLower++;
            else if(Character.isUpperCase(answer.charAt(i))) countUpper++;
            else if(Character.isDigit(answer.charAt(i))) countNum++;
            else countSpecial++;
        }

        if(countUpper > 0 && countLower > 0 && countNum > 0 && countSpecial > 0){
            System.out.println("Password is Strong");
        }
        else{
            System.out.println("Password is Weak");
        }
    }
    static void task2() {

        int numberToGuess = 5;
        while (true) {
            System.out.println("Enter a number between 1 and 10");
            String answer = input.nextLine();
            if (!validateWholeNumberValue(answer)) {
                System.out.println("Invalid numerical input");
                continue;
            }

            int number = Integer.parseInt(answer);

            if (number == numberToGuess) {
                System.out.println("Congrats! You guessed the number");
                break;
            }
            System.out.println("Incorrect Guess. Try again");
        }
    }
}
