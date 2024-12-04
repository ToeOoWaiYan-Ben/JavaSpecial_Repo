package Day7;

import java.time.LocalDateTime;

public class Hw_1 {
    private String id;//Instance
    private String name;//Instance
    private int phone;//Instance
    private static int totalEmployeeCount;//static
    private static String companyName;//static
    private String position; //Instance
    private double salary; //Instance

    public Hw_1(String id, String name, int phone, String position, double salary) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.position = position;
        this.salary = salary;
        totalEmployeeCount++; // Increment total employee count
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public static int getTotalEmployeeCount() {
        return totalEmployeeCount;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Hw_1.companyName = companyName;
    }

    //employee method details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Position: " + position);
        System.out.println("Salary: $" + salary);
        System.out.println("Company Name: " + companyName);
        System.out.println("Total Employee Count: " + totalEmployeeCount);
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the Employee instances
        Hw_1 emp1 = new Hw_1("001", "Yan", 123456789, "Developer", 70000);
        Hw_1 emp2 = new Hw_1("002", "Min", 987654321, "Manager", 85000);

        // Display each employee's details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        // Display total employee count and company name
        System.out.println("Total Employee Count: " + Hw_1.getTotalEmployeeCount());
        System.out.println("Company Name: " + Hw_1.getCompanyName());
    }
}