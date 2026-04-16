// Abstract base class
abstract class Task {
    public abstract void execute();
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Anonymous subclass of Task
        Task dataBackup = new Task() {
            @Override
            public void execute() {
                System.out.println("Step 1: Connecting to backup servver...");
                System.out.println("Step 2: Compressing target files...");
                System.out.println("Step 3: Uploading data to remote storage...");
                System.out.println("Step 4: Verifying backup integrity...");
                System.out.println("Step 5: Backup complete. Disconnecting.");
            }
        };

        // The variable type is abstract Task — the runtime behavior is the anonymous class
        dataBackup.execute();
    }
}