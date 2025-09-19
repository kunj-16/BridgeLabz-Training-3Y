class Student {
    private static String universityName = "GLA University";
    private static int totalStudents = 0;
    private final String rollNumber;
    private String name;
    private String grade;

    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for " + this.name + " to " + this.grade);
        } else {
            System.out.println("Invalid object - not a Student instance.");
        }
    }

    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University : " + universityName);
            System.out.println("Name       : " + this.name);
            System.out.println("Roll No.   : " + this.rollNumber);
            System.out.println("Grade      : " + this.grade);
        } else {
            System.out.println("Invalid object - not a Student instance.");
        }
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Kunj Bhasin", "U101", "A");
        Student s2 = new Student("Disha Gupta", "U102", "B");

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();

        System.out.println();
        Student.displayTotalStudents();

        System.out.println("\nUpdating grade...");
        s2.updateGrade("A+");

        System.out.println();
        s2.displayDetails();
    }
}
