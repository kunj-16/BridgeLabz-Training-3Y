class Course {
    private String courseName;
    private int durationHours;

    public Course(String courseName, int durationHours) {
        this.courseName = courseName;
        this.durationHours = durationHours;
    }

    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + durationHours + " hours");
    }
}

class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int durationHours, String platform, boolean isRecorded) {
        super(courseName, durationHours);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int durationHours, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, durationHours, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: $" + String.format("%.2f", fee));
        System.out.println("Discount: $" + String.format("%.2f", discount));
        System.out.println("Final Price: $" + String.format("%.2f", fee - discount));
    }
}

public class EducationalSystem {
    public static void main(String[] args) {
        Course basicCourse = new Course("Introduction to Java", 40);
        OnlineCourse freeCourse = new OnlineCourse("Web Development Basics", 60, "Coursera", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Data Structures & Algorithms", 80, "Udemy", true, 199.99, 50.00);

        System.out.println("--- Basic Course Details ---");
        basicCourse.displayDetails();
        System.out.println("\n--- Free Online Course Details ---");
        freeCourse.displayDetails();
        System.out.println("\n--- Paid Online Course Details ---");
        paidCourse.displayDetails();
    }
}