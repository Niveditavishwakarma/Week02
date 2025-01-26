package vehiclerentalsystem;

class Bike extends Vehicle implements Insurable{
    public Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% insurance rate
    }

    @Override
    public String getInsuranceDetails() {
        return "5% insurance applicable for bikes.";
    }
}
