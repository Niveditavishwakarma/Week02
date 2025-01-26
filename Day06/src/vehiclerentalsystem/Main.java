package vehiclerentalsystem;

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void calculateAndPrintDetails(List<Vehicle> vehicles, int days) {
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(days);
            double insuranceCost = 0;

            if (vehicle instanceof Insurable) {
                insuranceCost = ((Insurable) vehicle).calculateInsurance();
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
            }

            double totalCost = rentalCost + insuranceCost;
            System.out.println("Vehicle number: " + vehicle.getVehicleNumber());
            System.out.println("Vehicle type: " + vehicle.getType());
            System.out.println("Rental cost: " + rentalCost);
            System.out.println("Insurance cost: " + insuranceCost);
            System.out.println("Total cost: " + totalCost);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C001", "Sedan", 2000));
        vehicles.add(new Bike("B001", "Sportsbike", 500));
        vehicles.add(new Truck("T001", "Heavy Truck", 8000));

        System.out.print("Enter the number of rental days: ");
        int rentalDays = scanner.nextInt();

        calculateAndPrintDetails(vehicles, rentalDays);
        scanner.close();
    }
}
