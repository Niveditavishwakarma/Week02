package ridehailingapplication;

import java.util.*;

public class Main {
    public static void processVehicles(List<Vehicle> vehicles, double distance, String location) {
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Distance: " + distance + " km");
            System.out.println("Fare: " + vehicle.calculateFare(distance));

            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation(location);
                System.out.println("New Location: " + gps.getCurrentLocation());
            }

            System.out.println("---------------------------------------");
        }
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("CAR123", "John", 15.0);
        Bike bike = new Bike("BIKE456", "Mike", 8.0);
        Auto auto = new Auto("AUTO789", "Smith", 10.0);

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance (km): ");
        double distance = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter location: ");
        String location = scanner.nextLine();

        System.out.println("Ride Hailing Application");
        processVehicles(vehicles, distance, location);
    }
}
