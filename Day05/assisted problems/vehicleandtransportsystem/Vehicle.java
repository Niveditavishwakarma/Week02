package vehicleandtransportsystem;

public class Vehicle {
    private int maxSpeed;
    private String fuelType;

    public Vehicle(int maxSpeed,String fuelType)
    {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo(){
       System.out.println("Max speed: " + maxSpeed + "km/hr");
       System.out.println("FuelType: " + fuelType);
    }
}
