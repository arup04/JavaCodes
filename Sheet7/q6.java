package Sheet7;

// Class definition: Course
class Course {
    private int id;
    private String description;
    private int duration; // Duration in weeks
    private double fees;

    // Parameterized constructor
    public Course(int id, String description, int duration, double fees) {
        this.id = id;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    }

    // Method to display course data
    public void getData() {
        System.out.println("Course ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fees: $" + fees);
    }
}

// Main class to demonstrate functionality
public class q6 {
    public static void main(String[] args) {
        // Create an array of 5 Course objects
        Course[] courses = new Course[5];

        // Initialize the array with course objects
        courses[0] = new Course(101, "Java Programming", 12, 500.0);
        courses[1] = new Course(102, "Python for Data Science", 10, 600.0);
        courses[2] = new Course(103, "Web Development", 8, 450.0);
        courses[3] = new Course(104, "Database Management", 6, 400.0);
        courses[4] = new Course(105, "Machine Learning", 14, 800.0);

        // Display data for all courses
        System.out.println("Course Details:\n");
        for (Course course : courses) {
            course.getData();
            System.out.println("----------------------------");
        }
    }
}

