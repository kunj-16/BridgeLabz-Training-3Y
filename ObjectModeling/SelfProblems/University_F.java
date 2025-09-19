import java.util.ArrayList;

class Faculty {
    private String name;
    private String specialization;

    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getDetails() {
        return name + " (" + specialization + ")";
    }
}

class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

class University {
    private String universityName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showUniversityStructure() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println("- " + d.getDeptName());
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            System.out.println("- " + f.getDetails());
        }
    }

    public void closeUniversity() {
        System.out.println("Closing University: " + universityName);
        departments.clear();
        faculties.clear();
    }
}

public class University_F {
    public static void main(String[] args) {
        University uni = new University("Oxford University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mechanical Engineering");

        Faculty f1 = new Faculty("Dr. Ruby", "Artificial Intelligence");
        Faculty f2 = new Faculty("Dr. Monika", "Thermodynamics");

        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversityStructure();

        uni.closeUniversity();

        uni.showUniversityStructure();

        Faculty f3 = new Faculty("Dr. Priyanka", "Mathematics");
        System.out.println("Independent Faculty: " + f3.getDetails());
    }
}
