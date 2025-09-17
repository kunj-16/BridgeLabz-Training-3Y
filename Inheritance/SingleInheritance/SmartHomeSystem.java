class Device {
    private String deviceId;
    private boolean status; 

    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }

    public String getDeviceId() {
        return deviceId;
    }

    public boolean getStatus() {
        return status;
    }
}


class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, boolean status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }

    public double getTemperatureSetting() {
        return temperatureSetting;
    }

    public void setTemperatureSetting(double temperatureSetting) {
        this.temperatureSetting = temperatureSetting;
        System.out.println("Temperature set to " + temperatureSetting + "°C");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        
        Device livingRoomLight = new Device("L101", true);
        
        
        Thermostat hallwayThermostat = new Thermostat("T201", true, 22.5);

        System.out.println("--- Device Status ---");
        livingRoomLight.displayStatus();

        System.out.println("\n--- Thermostat Status ---");
        hallwayThermostat.displayStatus();

        System.out.println("\n--- Changing Thermostat Setting ---");
        hallwayThermostat.setTemperatureSetting(24.0);
        hallwayThermostat.displayStatus();
    }
}