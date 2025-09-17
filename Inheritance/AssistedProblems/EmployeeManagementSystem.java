class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Base Salary: $" + String.format("%.2f", salary));
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}


class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}


class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    private int internshipDurationMonths;

    public Intern(String name, int id, double salary, int internshipDurationMonths) {
        super(name, id, salary);
        this.internshipDurationMonths = internshipDurationMonths;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDurationMonths + " months");
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        
        Manager manager = new Manager("Alice Johnson", 101, 90000.00, 15);
        Developer developer = new Developer("Bob Smith", 201, 75000.00, "Java");
        Intern intern = new Intern("Charlie Brown", 301, 40000.00, 6);

        
        System.out.println("--- Manager Details ---");
        manager.displayDetails();
        System.out.println("\n--- Developer Details ---");
        developer.displayDetails();
        System.out.println("\n--- Intern Details ---");
        intern.displayDetails();
    }
}