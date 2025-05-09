
// Q15: Why avoid long methods
public class Q15_LongMethods {
    // Breaking long logic into smaller methods
    void startProgram() {
        greetUser();
        performTask();
        endProgram();
    }

    void greetUser() {
        System.out.println("Welcome to the program!");
    }

    void performTask() {
        System.out.println("Performing task...");
    }

    void endProgram() {
        System.out.println("Program ended.");
    }

    public static void main(String[] args) {
        Q15_LongMethods obj = new Q15_LongMethods();
        obj.startProgram();
    }
}
