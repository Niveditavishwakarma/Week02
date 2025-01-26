package vehiclerentalsystem;

class Car extends Vehicle implements Insurable{
    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1; // 10% insurance rate
    }

    @Override
    public String getInsuranceDetails() {
        return "10% insurance applicable for cars.";
    }
}
