// Class with overloaded print methods
class Printer {

    public void print(String text) {
        System.out.println("String version: " + text);
    }

    public void print(int number) {
        System.out.println("int version: " + number);
    }

    public void print(double number) {
        System.out.println("double version: " + number);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print("Hello, World!");  // resolves to print(String)
        printer.print(42);              // resolves to print(int)
        printer.print(3.14);            // resolves to print(double)
    }
}