
// Q13: Inheritance example

// Base class
class Person {
    String name;

    public void display() {
        System.out.println("Name: " + name);
    }
}

// Subclass
class Teacher extends Person {
    String subject;

    public void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Mr. John";
        t.subject = "Math";
        t.display();
    }
}
