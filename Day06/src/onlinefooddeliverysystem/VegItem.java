package onlinefooddeliverysystem;

 class VegItem extends FoodItem implements Discountable{
     private double discountRate;

     public VegItem(String itemName, double price, int quantity) {
         super(itemName, price, quantity);
     }

     @Override
     public double calculateTotalPrice() {
         return getPrice() * getQuantity();
     }

     @Override
     public void applyDiscount(double discountRate) {
         this.discountRate = discountRate;
         double discountedPrice = getPrice() - (getPrice() * discountRate / 100);
         setPrice(discountedPrice);
     }

     @Override
     public String getDiscountDetails() {
         return "Discount Rate: " + discountRate + "%";
     }
}
