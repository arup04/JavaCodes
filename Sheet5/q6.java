package Sheet5;

// Student class
class Student {
    private String name;

    // Method to input the student's name
    public void inputName(String name) {
        this.name = name;
    }

    // Method to return the student's name
    public String getName() {
        return name;
    }

    // Method to calculate average marks and determine pass/fail
    public String average(int mark1, int mark2, int mark3) {
        double average = (mark1 + mark2 + mark3) / 3.0;
        if (average >= 50) {
            return "Passed";
        } else {
            return "Failed";
        }
    }
}

// Main class to demonstrate the functionality
public class q6 {
    public static void main(String[] args) {
        // Create an instance of Student
        Student student = new Student();

        // Input the student's name
        student.inputName("Arup");

        // Display the student's name
        System.out.println("Student Name: " + student.getName());

        // Calculate the result based on marks
        int mark1 = 60;
        int mark2 = 45;
        int mark3 = 70;
        String result = student.average(mark1, mark2, mark3);

        // Display the result
        System.out.println("Result: " + result);
    }
}

