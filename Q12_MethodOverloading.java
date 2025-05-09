
// Q12: Method overloading example
public class Q12_MethodOverloading {

    // Method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Q12_MethodOverloading obj = new Q12_MethodOverloading();

        System.out.println("Sum of 2 numbers: " + obj.add(5, 10));
        System.out.println("Sum of 3 numbers: " + obj.add(5, 10, 15));
    }
}
