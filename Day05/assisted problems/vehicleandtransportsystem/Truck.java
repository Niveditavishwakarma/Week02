package vehicleandtransportsystem;

public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + "tons");
    }
}
