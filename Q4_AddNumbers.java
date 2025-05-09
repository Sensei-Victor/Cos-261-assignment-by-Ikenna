
// Q4: Program to add two numbers entered by user
import java.util.Scanner;

public class Q4_AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}
