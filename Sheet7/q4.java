package Sheet7;

// Base class: Teacher
class Teacher {
    private String name;
    private int age;
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    // Display teacher details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

// Derived class: Student
class Student extends Teacher {
    private String studentID;
    private double grade;

    // Constructor
    public Student(String name, int age, String subject, String studentID, double grade) {
        super(name, age, subject); // Reuse Teacher class code
        this.studentID = studentID;
        this.grade = grade;
    }

    // Getter methods for student-specific attributes
    public String getStudentID() {
        return studentID;
    }

    public double getGrade() {
        return grade;
    }

    // Display student details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the displayDetails method of Teacher
        System.out.println("Student ID: " + studentID);
        System.out.println("Grade: " + grade);
    }
}

// Main class to demonstrate functionality
public class q4{
    public static void main(String[] args) {
        // Create a Teacher instance
        Teacher teacher = new Teacher("Dr. Smith", 45, "Mathematics");
        System.out.println("Teacher Details:");
        teacher.displayDetails();

        // Create a Student instance
        Student student = new Student("Alice", 20, "Mathematics", "S12345", 89.5);
        System.out.println("\nStudent Details:");
        student.displayDetails();
    }
}
