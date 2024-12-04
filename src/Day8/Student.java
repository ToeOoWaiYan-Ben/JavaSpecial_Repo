package Day8;

public class Student {
    private String name;
    private int age;
    private String phoneNumber;

    // Constructor
    public Student(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    public void displayInfo() {
    System.out.println("Name: " +
            this.name + "\nAge: " +
            this.age + "\nPhone Number: " +
            this.phoneNumber);}
}
