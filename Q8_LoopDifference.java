
// Q8: Difference between while, for, and do-while loops
public class Q8_LoopDifference {
    public static void main(String[] args) {
        int i = 1;

        // while loop
        while (i <= 3) {
            System.out.println("while loop: " + i);
            i++;
        }

        // for loop
        for (int j = 1; j <= 3; j++) {
            System.out.println("for loop: " + j);
        }

        // do-while loop
        int k = 1;
        do {
            System.out.println("do-while loop: " + k);
            k++;
        } while (k <= 3);
    }
}
