package Day8;

import java.util.Scanner;

public class Student_Register {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number of Students that you want to register: ");

        int numberOfStudents = scan.nextInt();
        scan.nextLine();

        // Create an array to store the objects
        Student[] studentsInfo = new Student[numberOfStudents];


        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter Data for Student: " + (i+1) );

            System.out.print("Enter Name for Student: ");
            String name = scan.nextLine();

            System.out.print("Enter Age for Student: ");
            int age = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter Phone Number for Student: ");
            String phoneNumber = scan.nextLine();

            // Store in the array
            Student student=new Student(name, age, phoneNumber);
            studentsInfo[i] = student;
        }

        System.out.println("List of Registered Students:");
        for (int i = 0; i < studentsInfo.length; i++) {
          studentsInfo[i].displayInfo();
        }

        scan.close();
    }

}
