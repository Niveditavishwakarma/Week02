public class CarRentalSystem{
	public static void main(String args[])
	{
        // Create rentals using parameterized constructor
        CarRental rental1 = new CarRental("John Doe", "Toyota Corolla", 5, 60.0);
        CarRental rental2 = new CarRental("Jane Smith", "Honda Civic", 3, 55.0);

        // Display rental details
        System.out.println("Rental 1 Details:");
        rental1.displayRentalDetails();
        System.out.println();

        System.out.println("Rental 2 Details:");
        rental2.displayRentalDetails();
        System.out.println();

        // Create a rental using default constructor and set values
        CarRental rental3 = new CarRental();
        rental3.setCustomerName("Alice Brown");
        rental3.setCarModel("Ford Focus");
        rental3.setRentalDays(7);
        rental3.setDailyRate(70.0);

        System.out.println("Rental 3 Details:");
        rental3.displayRentalDetails();
    }
}

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Default Constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Unknown Car Model";
        this.rentalDays = 0;
        this.dailyRate = 50.0; 
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Car Rental Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}
