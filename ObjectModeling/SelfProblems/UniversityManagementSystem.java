import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int studentId;
    private List<Course> enrolledCourses;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this); 
            System.out.println(name + " enrolled in " + course.getCourseName());
        } else {
            System.out.println(name + " is already enrolled in " + course.getCourseName());
        }
    }

    public void viewCourses() {
        System.out.println("Student " + name + " is enrolled in:");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

class Professor {
    private String name;
    private String department;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        course.setProfessor(this); 
        System.out.println("Professor " + name + " assigned to teach " + course.getCourseName());
    }
}

class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: Professor " + professor.getName());
        } else {
            System.out.println("No professor assigned yet.");
        }
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        
        Professor prof1 = new Professor("Dr. Sharma", "Computer Science");
        Professor prof2 = new Professor("Dr. Mehta", "Mathematics");

        
        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Calculus");

        
        prof1.assignCourse(c1);
        prof2.assignCourse(c2);

        Student s1 = new Student("Kunj", 101);
        Student s2 = new Student("Disha", 102);
        Student s3 = new Student("Khushi", 103);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);
        s3.enrollCourse(c2);

        c1.showCourseDetails();
        c2.showCourseDetails();

        s1.viewCourses();
        s2.viewCourses();
        s3.viewCourses();
    }
}
