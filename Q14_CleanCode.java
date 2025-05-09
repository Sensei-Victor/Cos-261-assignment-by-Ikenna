
// Q14: Clean code example with practices
public class Q14_CleanCode {
    // Practice 1: meaningful variable names
    int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    // Practice 2: small functions
    void printMessage(String message) {
        System.out.println(message);
    }

    // Practice 3: avoid magic numbers
    void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q14_CleanCode obj = new Q14_CleanCode();
        obj.printMessage("Clean Code Example");
        obj.printStars(5);
        System.out.println("Sum: " + obj.calculateSum(10, 20));
    }
}
