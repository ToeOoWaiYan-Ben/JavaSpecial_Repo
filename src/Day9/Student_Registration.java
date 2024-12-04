package Day9;

import java.util.Scanner;

public class Student_Registration {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int MAX_STUDENTS = 100; // Maximum allowed students
        Student[] studentsInfo = new Student[MAX_STUDENTS];
        int count = 0;

        while (true) {
            if (count >= MAX_STUDENTS) {
                System.out.println("Maximum number of students reached. Cannot register more.");
                break;
            }

            // Register a single student
            studentsInfo[count] = registerStudent(scan);
            count++;

            // Ask if the user wants to continue
            System.out.print("Do you want to continue? (Yes/No): ");
            String response = scan.nextLine().trim().toLowerCase();

            if (response.equals("no")) {
                break;
            } else if (!response.equals("yes")) {
                System.out.println("Invalid response. Please enter Yes or No.");
            }
        }

        // Display registered students
        displayRegisteredStudents(studentsInfo, count);
        scan.close();
    }

    // Function to register a single student
    private static Student registerStudent(Scanner scan) {

        System.out.print("Enter Name for Student: ");
        String name = scan.nextLine();

        System.out.print("Enter Age for Student: ");
        int age = scan.nextInt();
        scan.nextLine(); // Consume the newline

        System.out.print("Enter Phone Number for Student: ");
        String phoneNumber = scan.nextLine();

        return new Student(name, age, phoneNumber);
    }

    // Function to display registered students
    private static void displayRegisteredStudents(Student[] studentsInfo, int count) {
        System.out.println("\nList of Registered Students:");
        for (int i = 0; i < count; i++) {
            studentsInfo[i].display();
        }
    }
}
