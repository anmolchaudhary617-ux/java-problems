public class Student {
    int roll;
    String name;

    // Default constructor
    Student() {
        roll = 0;
        name = "Unknown";
        System.out.println("Default constructor called");
    }

    // Parameterized constructor (1)
    Student(int r) {
        this.roll = r;
        this.name = "Unknown";
        System.out.println("Constructor with roll called");
    }

    // Parameterized constructor (2)
    Student(int r, String n) {
        this.roll = r;
        this.name = n;
        System.out.println("Constructor with roll and name called");
    }

    void display() {
        System.out.println("Roll = " + roll + ", Name = " + name);
    }
}

class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Student s1 = new Student();           // calls default
        Student s2 = new Student(101);        // calls Student(int)
        Student s3 = new Student(102, "Anmol"); // calls Student(int, String)

        s1.display();
        s2.display();
        s3.display();
    }
}