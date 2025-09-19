import java.util.ArrayList;

class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getDetails() {
        return name + " - " + role;
    }
}

class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void showEmployees() {
        System.out.println("Employees in " + deptName + ":");
        for (Employee emp : employees) {
            System.out.println(emp.getDetails());
        }
    }
}

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.showEmployees();
        }
    }

    public void closeCompany() {
        System.out.println("Closing company: " + companyName);
        departments.clear();
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department d1 = new Department("IT Department");
        Department d2 = new Department("HR Department");

        d1.addEmployee(new Employee("Kunj", "Software Engineer"));
        d1.addEmployee(new Employee("Disha", "System Analyst"));

        d2.addEmployee(new Employee("Parul", "HR Manager"));
        d2.addEmployee(new Employee("Isha", "Recruiter"));

        company.addDepartment(d1);
        company.addDepartment(d2);

        company.showCompanyStructure();

        company.closeCompany();

        company.showCompanyStructure();
    }
}
