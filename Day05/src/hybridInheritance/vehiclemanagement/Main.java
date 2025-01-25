package vehiclemanagement;

public class Main {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);

        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);

        System.out.println("----- Electric Vehicle Details -----");
        ev.displayDetails();
        ev.charge();

        System.out.println("---- Petrol Vehicle Details -----");
        pv.displayDetails();
        pv.refuel();
    }
}
