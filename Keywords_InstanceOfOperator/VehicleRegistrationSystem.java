class Vehicle {
    private static double registrationFee = 5000.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name          : " + this.ownerName);
            System.out.println("Vehicle Type        : " + this.vehicleType);
            System.out.println("Registration Number : " + this.registrationNumber);
            System.out.println("Registration Fee    : " + registrationFee);
        } else {
            System.out.println("Invalid object - not a Vehicle instance.");
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Kunj Bhasin", "Car", "REG101");
        Vehicle v2 = new Vehicle("Disha Gupta", "Bike", "REG102");

        v1.displayDetails();
        System.out.println();
        v2.displayDetails();

        System.out.println("\nUpdating Registration Fee to 7000...\n");
        Vehicle.updateRegistrationFee(7000);

        v1.displayDetails();
        System.out.println();
        v2.displayDetails();
    }
}
