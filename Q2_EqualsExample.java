
// Q2: Difference between == and .equals()
public class Q2_EqualsExample {
    public static void main(String[] args) {
        String a = new String("hello");
        String b = new String("hello");

        // == checks reference equality
        System.out.println(a == b); // false

        // .equals() checks value equality
        System.out.println(a.equals(b)); // true
    }
}
