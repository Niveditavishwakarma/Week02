package vehicleandtransportsystem;

public class Main {
    public static void main(String args[])
    {
        Vehicle car = new Car(200,"Petrol",5);
        Vehicle truck = new Truck(120,"Diesel",15);
        Vehicle motorcycle = new Motorcycle(150,"Petrol",false);

        Vehicle[] vehicles = {car,truck,motorcycle};

        System.out.println("Displaying vehicle information:");
        System.out.println("------------------------------");
        for(Vehicle vehicle : vehicles)
        {
            vehicle.displayInfo();
            System.out.println("------------------------------");
        }
    }
}
