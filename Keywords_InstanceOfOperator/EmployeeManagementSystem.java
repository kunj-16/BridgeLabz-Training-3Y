class Employee {
    private static String companyName = "Google";
    private static int totalEmployees = 0;
    private final String id;
    private String name;
    private String designation;

    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company    : " + companyName);
            System.out.println("Name       : " + this.name);
            System.out.println("ID         : " + this.id);
            System.out.println("Designation: " + this.designation);
        } else {
            System.out.println("Invalid object - not an Employee instance.");
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kunj Bhasin", "EMP101", "Software Engineer");
        Employee e2 = new Employee("Disha Gupta", "EMP102", "Data Scientist");

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();

        System.out.println();
        Employee.displayTotalEmployees();
    }
}
