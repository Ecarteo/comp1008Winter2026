public class HelloWorld {

    public static int addition(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Variables
        int age = 25;
        double price = 19.99;
        String name = "Juan";
        boolean isStudent = true;

        // If statements
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Child");
        }

        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Number: " + i);
        }

        // While loop
        int counter = 0;
        while (counter < 3) {
            System.out.println(counter);
            counter++;
        }

        int result = addition(5, 3);
        System.out.println(result); // 8

        // Arrays
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        int[] edades = {18, 25, 30, 22, 19};
        String[] nombres = {"Ana", "Luis", "María", "Pedro"};
            }
}
