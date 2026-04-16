// Base class illustrating Method Overloading
class Logger {
    // Original method
    void log(String message) {
        System.out.println("[INFO] " + message);
    }

    // OVERLOADED method
    void log(String message, int code) {
        System.out.println("[INFO-" + code + "] " + message);
    }
}

// Subclass illustrating Method Overriding
class ErrorLogger extends Logger {
    // OVERRIDDEN method
    @Override
    void log(String message) {
        System.out.println("[ERROR] " + message);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Polmorphism: Logger reference pointing to an ErrorLogger object
        Logger logger = new ErrorLogger();

        // 1. Overriding in action: 
        // Calls the version defined in ErrorLogger
        logger.log("File not found");

        // 2. Overloading/Inheritance in action:
        logger.log("File not found", 404);
    }
}