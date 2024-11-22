package com.gsv.project;

class Teacher {
 String name;
 int age;
 String subject;

 public Teacher(String name, int age, String subject) {
     this.name = name;
     this.age = age;
     this.subject = subject;
 }
 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Subject: " + subject);
 }
}

class Student extends Teacher {
 int rollNumber;
 String grade;
 
 public Student(String name, int age, String subject, int rollNumber, String grade) {
     super(name, age, subject); // Reusing Teacher's constructor
     this.rollNumber = rollNumber;
     this.grade = grade;
 }
 
 public void displayStudentDetails() {
     // Reuse displayDetails() from Teacher
     super.displayDetails();
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Grade: " + grade);
 }
}

public class student_teacher {
 public static void main(String[] args) {
     
     Student st = new Student("chaman", 19, "Mathematics", 20, "A");
     System.out.println("Student Details:");
     st.displayStudentDetails();
 }
}
