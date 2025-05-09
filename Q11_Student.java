
// Q11: Class Student with properties and methods
class Student {
    String name;
    String matricNo;
    double score;

    // Constructor
    public Student(String name, String matricNo, double score) {
        this.name = name;
        this.matricNo = matricNo;
        this.score = score;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Matric No: " + matricNo);
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        Student s = new Student("Alice", "MAT123", 85.5);
        s.displayInfo();
    }
}
