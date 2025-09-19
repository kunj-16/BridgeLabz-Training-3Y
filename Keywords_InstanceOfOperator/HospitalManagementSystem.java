class Patient {
    private static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital   : " + hospitalName);
            System.out.println("Patient ID : " + this.patientID);
            System.out.println("Name       : " + this.name);
            System.out.println("Age        : " + this.age);
            System.out.println("Ailment    : " + this.ailment);
        } else {
            System.out.println("Invalid object - not a Patient instance.");
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient("Kunj Bhasin", 21, "Fever", "P101");
        Patient p2 = new Patient("Disha Gupta", 20, "Fracture", "P102");

        p1.displayDetails();
        System.out.println();
        p2.displayDetails();

        System.out.println();
        Patient.getTotalPatients();
    }
}
