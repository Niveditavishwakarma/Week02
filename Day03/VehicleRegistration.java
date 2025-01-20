public class VehicleRegistration{
	 public static void main(String[] args) {
        // Creating a Vehicle instance
        Vehicle vehicle1 = new Vehicle("John Doe", "Car", "REG12345");
        vehicle1.displayRegistrationDetails();
        Vehicle.updateRegistrationFee(150.0);
		vehicle1.displayRegistrationDetails();
    }
}
class Vehicle {
    static double registrationFee = 100.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    // Constructor to initialize owner name, vehicle type, and registration number
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to check and display vehicle registration details
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
			System.out.println();
        }
    }
}

   