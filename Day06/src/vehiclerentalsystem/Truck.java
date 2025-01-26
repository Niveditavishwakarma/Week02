package vehiclerentalsystem;

 class Truck extends Vehicle implements Insurable{
     public Truck(String vehicleNumber, String type, double rentalRate) {
         super(vehicleNumber, type, rentalRate);
     }

     @Override
     public double calculateRentalCost(int days) {
         return getRentalRate() * days * 1.2; // 20% surcharge for trucks
     }

     @Override
     public double calculateInsurance() {
         return getRentalRate() * 0.15; // 15% insurance rate
     }

     @Override
     public String getInsuranceDetails() {
         return "15% insurance applicable for trucks.";
     }
}
