
// Q16: Java naming conventions example

// Class name: PascalCase
class StudentInfo {

    // Variable name: camelCase
    String studentName;

    // Method name: camelCase
    void displayStudent() {
        System.out.println("Student Name: " + studentName);
    }

    public static void main(String[] args) {
        StudentInfo s = new StudentInfo();
        s.studentName = "Alice";
        s.displayStudent();
    }
}
